package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class iv extends c {
    private final int height = 36;
    private final int width = 33;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 33;
            case 1:
                return 36;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = c.h(looper);
                float[] g = c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-15028967);
                g = c.a(g, 1.0f, 0.0f, -48.0f, 0.0f, 1.0f, -27.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l = c.l(looper);
                l.moveTo(63.0f, 27.178974f);
                l.lineTo(63.0f, 27.0f);
                l.lineTo(66.0f, 27.0f);
                l.lineTo(66.0f, 27.040356f);
                l.lineTo(66.04035f, 27.0f);
                l.lineTo(81.21933f, 42.178974f);
                l.lineTo(79.17898f, 44.21933f);
                l.lineTo(66.0f, 31.040356f);
                l.lineTo(66.0f, 63.0f);
                l.lineTo(63.0f, 63.0f);
                l.lineTo(63.0f, 31.259686f);
                l.lineTo(50.040356f, 44.21933f);
                l.lineTo(48.0f, 42.178974f);
                l.lineTo(63.0f, 27.178974f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
