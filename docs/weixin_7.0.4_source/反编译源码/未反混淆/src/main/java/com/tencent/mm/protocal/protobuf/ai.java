package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class ai extends bsr {
    public String cMC;
    public String cMD;
    public int cME;
    public String kde;
    public String vBu;
    public String vBv;
    public int vBw;
    public int vBx;
    public cdc vBy;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(88993);
        b bVar;
        int ix;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.cMC == null) {
                bVar = new b("Not all required fields were included: card_id");
                AppMethodBeat.o(88993);
                throw bVar;
            }
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.kde != null) {
                aVar.e(2, this.kde);
            }
            aVar.iz(3, this.cME);
            if (this.cMC != null) {
                aVar.e(4, this.cMC);
            }
            if (this.cMD != null) {
                aVar.e(5, this.cMD);
            }
            if (this.vBu != null) {
                aVar.e(6, this.vBu);
            }
            if (this.vBv != null) {
                aVar.e(7, this.vBv);
            }
            aVar.iz(8, this.vBw);
            aVar.iz(9, this.vBx);
            if (this.vBy != null) {
                aVar.iy(10, this.vBy.computeSize());
                this.vBy.writeFields(aVar);
            }
            AppMethodBeat.o(88993);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.kde != null) {
                ix += e.a.a.b.b.a.f(2, this.kde);
            }
            ix += e.a.a.b.b.a.bs(3, this.cME);
            if (this.cMC != null) {
                ix += e.a.a.b.b.a.f(4, this.cMC);
            }
            if (this.cMD != null) {
                ix += e.a.a.b.b.a.f(5, this.cMD);
            }
            if (this.vBu != null) {
                ix += e.a.a.b.b.a.f(6, this.vBu);
            }
            if (this.vBv != null) {
                ix += e.a.a.b.b.a.f(7, this.vBv);
            }
            ix = (ix + e.a.a.b.b.a.bs(8, this.vBw)) + e.a.a.b.b.a.bs(9, this.vBx);
            if (this.vBy != null) {
                ix += e.a.a.a.ix(10, this.vBy.computeSize());
            }
            AppMethodBeat.o(88993);
            return ix;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.cMC == null) {
                bVar = new b("Not all required fields were included: card_id");
                AppMethodBeat.o(88993);
                throw bVar;
            }
            AppMethodBeat.o(88993);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            ai aiVar = (ai) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aiVar.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(88993);
                    return 0;
                case 2:
                    aiVar.kde = aVar3.BTU.readString();
                    AppMethodBeat.o(88993);
                    return 0;
                case 3:
                    aiVar.cME = aVar3.BTU.vd();
                    AppMethodBeat.o(88993);
                    return 0;
                case 4:
                    aiVar.cMC = aVar3.BTU.readString();
                    AppMethodBeat.o(88993);
                    return 0;
                case 5:
                    aiVar.cMD = aVar3.BTU.readString();
                    AppMethodBeat.o(88993);
                    return 0;
                case 6:
                    aiVar.vBu = aVar3.BTU.readString();
                    AppMethodBeat.o(88993);
                    return 0;
                case 7:
                    aiVar.vBv = aVar3.BTU.readString();
                    AppMethodBeat.o(88993);
                    return 0;
                case 8:
                    aiVar.vBw = aVar3.BTU.vd();
                    AppMethodBeat.o(88993);
                    return 0;
                case 9:
                    aiVar.vBx = aVar3.BTU.vd();
                    AppMethodBeat.o(88993);
                    return 0;
                case 10:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        cdc cdc = new cdc();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = cdc.populateBuilderWithField(aVar4, cdc, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aiVar.vBy = cdc;
                    }
                    AppMethodBeat.o(88993);
                    return 0;
                default:
                    AppMethodBeat.o(88993);
                    return -1;
            }
        } else {
            AppMethodBeat.o(88993);
            return -1;
        }
    }
}
