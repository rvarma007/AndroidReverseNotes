package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class ea extends a {
    public String fns;
    public String key;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(14682);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.key != null) {
                aVar.e(1, this.key);
            }
            if (this.fns != null) {
                aVar.e(2, this.fns);
            }
            AppMethodBeat.o(14682);
            return 0;
        } else if (i == 1) {
            if (this.key != null) {
                f = e.a.a.b.b.a.f(1, this.key) + 0;
            } else {
                f = 0;
            }
            if (this.fns != null) {
                f += e.a.a.b.b.a.f(2, this.fns);
            }
            AppMethodBeat.o(14682);
            return f;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(14682);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            ea eaVar = (ea) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    eaVar.key = aVar3.BTU.readString();
                    AppMethodBeat.o(14682);
                    return 0;
                case 2:
                    eaVar.fns = aVar3.BTU.readString();
                    AppMethodBeat.o(14682);
                    return 0;
                default:
                    AppMethodBeat.o(14682);
                    return -1;
            }
        } else {
            AppMethodBeat.o(14682);
            return -1;
        }
    }
}
