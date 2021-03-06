package com.tencent.p177mm.plugin.gwallet.p979a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.VError;

/* renamed from: com.tencent.mm.plugin.gwallet.a.c */
public final class C28282c {
    public int nqa;
    String nqb;

    public C28282c(int i, String str) {
        AppMethodBeat.m2504i(41705);
        this.nqa = i;
        if (str == null || str.trim().length() == 0) {
            this.nqb = C28276b.m44866wR(i);
            AppMethodBeat.m2505o(41705);
            return;
        }
        this.nqb = str + " (response: " + C28276b.m44866wR(i) + ")";
        AppMethodBeat.m2505o(41705);
    }

    public final int bFQ() {
        switch (this.nqa) {
            case -2001:
            case -1004:
                return 3;
            case -1009:
            case VError.ERROR_FACE_MODEL_INIT /*-1002*/:
            case VError.ERROR_FACE_TXT_INIT /*-1001*/:
            case -1000:
            case 2:
            case 3:
            case 4:
            case 6:
                return 5;
            case 0:
                return 0;
            case 1:
                return 1;
            case 5:
                return 6;
            case 7:
                return 100000002;
            case 8:
                return 106;
            default:
                return this.nqa;
        }
    }

    public final boolean isSuccess() {
        return this.nqa == 0;
    }

    public final String toString() {
        AppMethodBeat.m2504i(41706);
        String str = "IapResult: " + this.nqb;
        AppMethodBeat.m2505o(41706);
        return str;
    }
}
