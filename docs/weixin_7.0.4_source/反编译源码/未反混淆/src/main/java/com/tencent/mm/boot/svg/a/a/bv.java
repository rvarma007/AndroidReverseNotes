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

public final class bv extends c {
    private final int height = 80;
    private final int width = 80;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 80;
            case 1:
                return 80;
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
                Paint a = c.a(k, looper);
                a.setColor(-1);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 14.0f, 0.0f, 1.0f, 13.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 1.944404f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                k = c.a(a, looper);
                Path l = c.l(looper);
                l.moveTo(0.7804622f, 0.3839826f);
                l.lineTo(7.9495535f, 0.3839826f);
                l.lineTo(49.394913f, 52.485867f);
                l.lineTo(42.225822f, 52.485867f);
                l.lineTo(0.7804622f, 0.3839826f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, k);
                canvas.restore();
                canvas.restore();
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 53.047207f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l2 = c.l(looper);
                l2.moveTo(1.2184111f, 0.5067365f);
                l2.lineTo(8.387503f, 0.5067365f);
                l2.lineTo(49.395386f, 51.35372f);
                l2.lineTo(42.61873f, 51.2473f);
                l2.lineTo(1.2184111f, 0.5067365f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 2);
                canvas.drawPath(l2, a2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
