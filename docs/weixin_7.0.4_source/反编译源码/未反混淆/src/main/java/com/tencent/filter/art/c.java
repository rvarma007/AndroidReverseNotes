package com.tencent.filter.art;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.art.BokehFilter.a;
import com.tencent.filter.m.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class c extends BaseFilter {
    int bNh = 1;
    float bNi = 0.5f;
    float bNj = ((float) (1.0d / Math.exp(0.0d)));
    float bNk = 0.0f;
    int bNl = 1;
    float bNm;
    float bNn;
    float bNo;
    float bNp;
    float bNq = 0.5f;
    float bNr = 1.2f;
    float bNs = 960.0f;
    int radius = 8;
    float tx;
    float ty;
    int type;

    public c() {
        super(GLSLRender.bJB);
        AppMethodBeat.i(86293);
        AppMethodBeat.o(86293);
    }

    private void W(float f) {
        this.bNi = 1.0f - f;
        this.radius = 5;
        if (((double) this.bNi) < 0.8d && this.bNi > 0.4f) {
            this.radius = 8;
        } else if (this.bNi <= 0.4f) {
            this.bNi = 0.4f;
            this.radius = (int) (8.0f + (6.0f * f));
        }
        if (this.bNl == 2) {
            this.bNi = 1.0f - (0.6f * f);
        }
        if (((double) f) < 0.3d) {
            this.bNr = 3.0f * f;
        } else {
            this.bNr = ((f - 0.3f) * 1.3f) + 0.9f;
        }
    }

    public final void setParameterDic(Map<String, Object> map) {
        AppMethodBeat.i(86294);
        if (map.containsKey("bokehmode")) {
            this.bNl = ((Integer) map.get("bokehmode")).intValue();
        }
        if (map.containsKey("inputradius")) {
            W(((Float) map.get("input_radius")).floatValue());
        }
        if (map.containsKey("blurRiness")) {
            this.bNq = ((Float) map.get("blurRiness")).floatValue();
            W(this.bNq);
        }
        if (map.containsKey("MethodType")) {
            this.type = ((Integer) map.get("MethodType")).intValue();
        }
        if (map.containsKey("bokehType")) {
            this.bNh = ((Integer) map.get("bokehType")).intValue() % 6;
        }
        if (map.containsKey("tx")) {
            this.tx = ((Float) map.get("tx")).floatValue();
        }
        if (map.containsKey("ty")) {
            this.ty = ((Float) map.get("ty")).floatValue();
        }
        if (map.containsKey("innerRadius")) {
            this.bNm = ((Float) map.get("innerRadius")).floatValue();
        }
        if (map.containsKey("outerRadius")) {
            this.bNn = ((Float) map.get("outerRadius")).floatValue();
        }
        if (map.containsKey("theta")) {
            this.bNo = ((Float) map.get("theta")).floatValue();
        }
        if (map.containsKey("eclipseA")) {
            this.bNp = ((Float) map.get("eclipseA")).floatValue();
        }
        if (map.containsKey("defaultWidth")) {
            this.bNs = ((Float) map.get("defaultWidth")).floatValue();
        }
        if (map.containsKey("lumi_threshold")) {
            this.bNk = ((Float) map.get("lumi_threshold")).floatValue();
        }
        if (map.containsKey("lumi_weight")) {
            this.bNj = (float) (1.0d / Math.exp((double) ((Float) map.get("lumi_weight")).floatValue()));
        }
        AppMethodBeat.o(86294);
    }

    public final void ApplyGLSLFilter(boolean z, float f, float f2) {
        AppMethodBeat.i(86295);
        if (IsFilterInvalute()) {
            super.ApplyGLSLFilter(z, f, f2);
            AppMethodBeat.o(86295);
            return;
        }
        this.glsl_programID = GLSLRender.bJB;
        if (this.type != 0) {
            BaseFilter baseFilter;
            if (this.bNh != 0) {
                this.scaleFact = Math.min(this.bNs / Math.max(f, f2), 1.0f) * this.bNi;
                a aVar = new a(this.radius, this.bNj, this.bNk, this.bNh, this.bNl);
                aVar.addParam(new f("lumi_p", ((float) this.radius) * 1.0f));
                aVar.setScaleFact(this.scaleFact);
                setNextFilter(aVar, null);
                BaseFilter baseFilter2 = new BaseFilter(GLSLRender.bJB);
                aVar.setNextFilter(baseFilter2, null);
                baseFilter = baseFilter2;
            } else {
                baseFilter = new BaseFilter(GLSLRender.bKm);
                baseFilter.addParam(new f("depthr", this.bNr));
                setNextFilter(baseFilter, null);
            }
            int i = GLSLRender.bKk;
            float f3 = this.bNo;
            float f4 = this.bNp;
            switch (this.type) {
                case 1:
                    i = GLSLRender.bKk;
                    break;
                case 2:
                    i = GLSLRender.bKl;
                    break;
                case 3:
                    f3 = 0.0f;
                    i = GLSLRender.bKk;
                    f4 = 1.0f;
                    break;
            }
            BaseFilter baseFilter3 = new BaseFilter(i);
            baseFilter3.addParam(new f("ratio", f2 / f));
            baseFilter3.addParam(new f("tx", this.tx / f));
            baseFilter3.addParam(new f("ty", this.ty / f2));
            baseFilter3.addParam(new f("innerRadius", this.bNm / f));
            baseFilter3.addParam(new f("outerRadius", this.bNn / f));
            baseFilter3.addParam(new f("theta", f3));
            baseFilter3.addParam(new f("eclipseA", f4));
            baseFilter.setNextFilter(baseFilter3, new int[]{0});
        }
        super.ApplyGLSLFilter(z, f, f2);
        AppMethodBeat.o(86295);
    }
}
