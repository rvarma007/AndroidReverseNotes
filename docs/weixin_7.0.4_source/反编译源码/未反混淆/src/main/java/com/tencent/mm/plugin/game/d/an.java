package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class an extends a {
    public String Desc;
    public String Title;
    public String fKh;
    public String mZj;
    public String nbe;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(111580);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.nbe != null) {
                aVar.e(1, this.nbe);
            }
            if (this.Title != null) {
                aVar.e(2, this.Title);
            }
            if (this.Desc != null) {
                aVar.e(3, this.Desc);
            }
            if (this.mZj != null) {
                aVar.e(4, this.mZj);
            }
            if (this.fKh != null) {
                aVar.e(5, this.fKh);
            }
            AppMethodBeat.o(111580);
            return 0;
        } else if (i == 1) {
            if (this.nbe != null) {
                f = e.a.a.b.b.a.f(1, this.nbe) + 0;
            } else {
                f = 0;
            }
            if (this.Title != null) {
                f += e.a.a.b.b.a.f(2, this.Title);
            }
            if (this.Desc != null) {
                f += e.a.a.b.b.a.f(3, this.Desc);
            }
            if (this.mZj != null) {
                f += e.a.a.b.b.a.f(4, this.mZj);
            }
            if (this.fKh != null) {
                f += e.a.a.b.b.a.f(5, this.fKh);
            }
            AppMethodBeat.o(111580);
            return f;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(111580);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            an anVar = (an) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    anVar.nbe = aVar3.BTU.readString();
                    AppMethodBeat.o(111580);
                    return 0;
                case 2:
                    anVar.Title = aVar3.BTU.readString();
                    AppMethodBeat.o(111580);
                    return 0;
                case 3:
                    anVar.Desc = aVar3.BTU.readString();
                    AppMethodBeat.o(111580);
                    return 0;
                case 4:
                    anVar.mZj = aVar3.BTU.readString();
                    AppMethodBeat.o(111580);
                    return 0;
                case 5:
                    anVar.fKh = aVar3.BTU.readString();
                    AppMethodBeat.o(111580);
                    return 0;
                default:
                    AppMethodBeat.o(111580);
                    return -1;
            }
        } else {
            AppMethodBeat.o(111580);
            return -1;
        }
    }
}
