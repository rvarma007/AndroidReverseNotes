package com.tencent.p177mm.plugin.downloader.p723c.p724b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.plugin.downloader.c.b.l */
public final class C6832l extends C1331a {
    public long duration;
    public long interval;
    public long kLH;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(35538);
        int o;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            c6093a.mo13472ai(1, this.duration);
            c6093a.mo13472ai(2, this.interval);
            c6093a.mo13472ai(3, this.kLH);
            AppMethodBeat.m2505o(35538);
            return 0;
        } else if (i == 1) {
            o = ((C6091a.m9578o(1, this.duration) + 0) + C6091a.m9578o(2, this.interval)) + C6091a.m9578o(3, this.kLH);
            AppMethodBeat.m2505o(35538);
            return o;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (o = C1331a.getNextFieldNumber(c6086a); o > 0; o = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, o)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(35538);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C6832l c6832l = (C6832l) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    c6832l.duration = c6086a2.BTU.mo13459ve();
                    AppMethodBeat.m2505o(35538);
                    return 0;
                case 2:
                    c6832l.interval = c6086a2.BTU.mo13459ve();
                    AppMethodBeat.m2505o(35538);
                    return 0;
                case 3:
                    c6832l.kLH = c6086a2.BTU.mo13459ve();
                    AppMethodBeat.m2505o(35538);
                    return 0;
                default:
                    AppMethodBeat.m2505o(35538);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(35538);
            return -1;
        }
    }
}
