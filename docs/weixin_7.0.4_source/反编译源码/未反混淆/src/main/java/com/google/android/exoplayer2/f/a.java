package com.google.android.exoplayer2.f;

import android.graphics.Bitmap;
import android.support.v4.widget.j;
import android.text.Layout.Alignment;
import com.tencent.smtt.sdk.WebView;

public class a {
    public final Bitmap bitmap;
    public final Alignment bkV;
    public final float bkW;
    public final int bkX;
    public final float bkY;
    public final int bkZ;
    public final float bla;
    public final boolean blb;
    public final int lineType;
    public final float size;
    public final CharSequence text;
    public final int windowColor;

    public a(Bitmap bitmap, float f, float f2, float f3, float f4) {
        this(null, null, bitmap, f2, 0, 0, f, 0, f3, f4, false, WebView.NIGHT_MODE_COLOR);
    }

    public a(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, j.INVALID_ID, j.INVALID_ID, Float.MIN_VALUE, j.INVALID_ID, Float.MIN_VALUE);
    }

    public a(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, WebView.NIGHT_MODE_COLOR);
    }

    public a(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, f3, Float.MIN_VALUE, z, i4);
    }

    private a(CharSequence charSequence, Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, float f3, float f4, boolean z, int i4) {
        this.text = charSequence;
        this.bkV = alignment;
        this.bitmap = bitmap;
        this.bkW = f;
        this.lineType = i;
        this.bkX = i2;
        this.bkY = f2;
        this.bkZ = i3;
        this.size = f3;
        this.bla = f4;
        this.blb = z;
        this.windowColor = i4;
    }
}
