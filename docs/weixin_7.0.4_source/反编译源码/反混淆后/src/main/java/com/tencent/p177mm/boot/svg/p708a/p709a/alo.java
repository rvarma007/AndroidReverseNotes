package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.alo */
public final class alo extends C5163c {
    private final int height = 144;
    private final int width = 144;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 144;
            case 1:
                return 144;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                k2 = C5163c.m7876a(k, looper);
                k2.setColor(-855638017);
                canvas.save();
                Paint a = C5163c.m7876a(k2, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(0.0f, 28.8f);
                l.cubicTo(0.0f, 12.894198f, 12.894198f, 0.0f, 28.8f, 0.0f);
                l.lineTo(115.2f, 0.0f);
                l.cubicTo(131.1058f, 0.0f, 144.0f, 12.894198f, 144.0f, 28.8f);
                l.lineTo(144.0f, 115.2f);
                l.cubicTo(144.0f, 131.1058f, 131.1058f, 144.0f, 115.2f, 144.0f);
                l.lineTo(28.8f, 144.0f);
                l.cubicTo(12.894198f, 144.0f, 0.0f, 131.1058f, 0.0f, 115.2f);
                l.lineTo(0.0f, 28.8f);
                l.close();
                canvas.drawPath(l, a);
                canvas.restore();
                canvas.save();
                k = C5163c.m7876a(k, looper);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                float[] a2 = C5163c.m7878a(g, 1.0f, 0.0f, 39.0f, 0.0f, 1.0f, 48.0f);
                h.reset();
                h.setValues(a2);
                canvas.concat(h);
                canvas.save();
                k2 = C5163c.m7876a(k, looper);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(3.1316513E-15f, 25.08f);
                l2.lineTo(-3.1316513E-15f, 21.72f);
                l2.lineTo(64.8f, 21.72f);
                l2.lineTo(64.8f, 25.08f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 1);
                WeChatSVGRenderC2Java.setFillType(l2, 1);
                canvas.drawPath(l2, k2);
                canvas.restore();
                canvas.save();
                k2 = C5163c.m7876a(k, looper);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(-3.0222737E-15f, 4.08f);
                l2.lineTo(-3.0222737E-15f, 0.72f);
                l2.lineTo(3.456f, 0.72f);
                l2.lineTo(3.456f, 4.08f);
                l2.lineTo(-3.0222737E-15f, 4.08f);
                l2.close();
                l2.moveTo(6.912f, 4.08f);
                l2.lineTo(6.912f, 0.72f);
                l2.lineTo(10.368f, 0.72f);
                l2.lineTo(10.368f, 4.08f);
                l2.lineTo(6.912f, 4.08f);
                l2.close();
                l2.moveTo(13.824f, 4.08f);
                l2.lineTo(13.824f, 0.72f);
                l2.lineTo(17.28f, 0.72f);
                l2.lineTo(17.28f, 4.08f);
                l2.lineTo(13.824f, 4.08f);
                l2.close();
                l2.moveTo(20.736f, 4.08f);
                l2.lineTo(20.736f, 0.72f);
                l2.lineTo(24.192001f, 0.72f);
                l2.lineTo(24.192001f, 4.08f);
                l2.lineTo(20.736f, 4.08f);
                l2.close();
                l2.moveTo(27.648f, 4.08f);
                l2.lineTo(27.648f, 0.72f);
                l2.lineTo(31.104f, 0.72f);
                l2.lineTo(31.104f, 4.08f);
                l2.lineTo(27.648f, 4.08f);
                l2.close();
                l2.moveTo(34.56f, 4.08f);
                l2.lineTo(34.56f, 0.72f);
                l2.lineTo(38.016003f, 0.72f);
                l2.lineTo(38.016003f, 4.08f);
                l2.lineTo(34.56f, 4.08f);
                l2.close();
                l2.moveTo(41.472f, 4.08f);
                l2.lineTo(41.472f, 0.72f);
                l2.lineTo(44.928f, 0.72f);
                l2.lineTo(44.928f, 4.08f);
                l2.lineTo(41.472f, 4.08f);
                l2.close();
                l2.moveTo(48.384003f, 4.08f);
                l2.lineTo(48.384003f, 0.72f);
                l2.lineTo(51.84f, 0.72f);
                l2.lineTo(51.84f, 4.08f);
                l2.lineTo(48.384003f, 4.08f);
                l2.close();
                l2.moveTo(55.296f, 4.08f);
                l2.lineTo(55.296f, 0.72f);
                l2.lineTo(58.752003f, 0.72f);
                l2.lineTo(58.752003f, 4.08f);
                l2.lineTo(55.296f, 4.08f);
                l2.close();
                l2.moveTo(62.208f, 4.08f);
                l2.lineTo(62.208f, 0.72f);
                l2.lineTo(65.664f, 0.72f);
                l2.lineTo(65.664f, 4.08f);
                l2.lineTo(62.208f, 4.08f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 1);
                canvas.drawPath(l2, k2);
                canvas.restore();
                canvas.save();
                k2 = C5163c.m7876a(k, looper);
                l2 = C5163c.m7884l(looper);
                l2.moveTo(-3.4540271E-15f, 46.08f);
                l2.lineTo(-3.4540271E-15f, 42.72f);
                l2.lineTo(3.456f, 42.72f);
                l2.lineTo(3.456f, 46.08f);
                l2.lineTo(-3.4540271E-15f, 46.08f);
                l2.close();
                l2.moveTo(6.912f, 46.08f);
                l2.lineTo(6.912f, 42.72f);
                l2.lineTo(10.368f, 42.72f);
                l2.lineTo(10.368f, 46.08f);
                l2.lineTo(6.912f, 46.08f);
                l2.close();
                l2.moveTo(13.824f, 46.08f);
                l2.lineTo(13.824f, 42.72f);
                l2.lineTo(17.28f, 42.72f);
                l2.lineTo(17.28f, 46.08f);
                l2.lineTo(13.824f, 46.08f);
                l2.close();
                l2.moveTo(20.736f, 46.08f);
                l2.lineTo(20.736f, 42.72f);
                l2.lineTo(24.192001f, 42.72f);
                l2.lineTo(24.192001f, 46.08f);
                l2.lineTo(20.736f, 46.08f);
                l2.close();
                l2.moveTo(27.648f, 46.08f);
                l2.lineTo(27.648f, 42.72f);
                l2.lineTo(31.104f, 42.72f);
                l2.lineTo(31.104f, 46.08f);
                l2.lineTo(27.648f, 46.08f);
                l2.close();
                l2.moveTo(34.56f, 46.08f);
                l2.lineTo(34.56f, 42.72f);
                l2.lineTo(38.016003f, 42.72f);
                l2.lineTo(38.016003f, 46.08f);
                l2.lineTo(34.56f, 46.08f);
                l2.close();
                l2.moveTo(41.472f, 46.08f);
                l2.lineTo(41.472f, 42.72f);
                l2.lineTo(44.928f, 42.72f);
                l2.lineTo(44.928f, 46.08f);
                l2.lineTo(41.472f, 46.08f);
                l2.close();
                l2.moveTo(48.384003f, 46.08f);
                l2.lineTo(48.384003f, 42.72f);
                l2.lineTo(51.84f, 42.72f);
                l2.lineTo(51.84f, 46.08f);
                l2.lineTo(48.384003f, 46.08f);
                l2.close();
                l2.moveTo(55.296f, 46.08f);
                l2.lineTo(55.296f, 42.72f);
                l2.lineTo(58.752003f, 42.72f);
                l2.lineTo(58.752003f, 46.08f);
                l2.lineTo(55.296f, 46.08f);
                l2.close();
                l2.moveTo(62.208f, 46.08f);
                l2.lineTo(62.208f, 42.72f);
                l2.lineTo(65.664f, 42.72f);
                l2.lineTo(65.664f, 46.08f);
                l2.lineTo(62.208f, 46.08f);
                l2.close();
                WeChatSVGRenderC2Java.setFillType(l2, 1);
                canvas.drawPath(l2, k2);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
