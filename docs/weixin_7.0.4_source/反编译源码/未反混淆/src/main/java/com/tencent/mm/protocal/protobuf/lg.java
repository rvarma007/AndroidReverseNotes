package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class lg extends btd {
    public int luT;
    public String luU;
    public LinkedList<di> vOM = new LinkedList();

    public lg() {
        AppMethodBeat.i(28346);
        AppMethodBeat.o(28346);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(28347);
        b bVar;
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(28347);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.e(2, 8, this.vOM);
            aVar.iz(3, this.luT);
            if (this.luU != null) {
                aVar.e(4, this.luU);
            }
            AppMethodBeat.o(28347);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix = (ix + e.a.a.a.c(2, 8, this.vOM)) + e.a.a.b.b.a.bs(3, this.luT);
            if (this.luU != null) {
                ix += e.a.a.b.b.a.f(4, this.luU);
            }
            AppMethodBeat.o(28347);
            return ix;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.vOM.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(28347);
                throw bVar;
            }
            AppMethodBeat.o(28347);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            lg lgVar = (lg) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        lgVar.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(28347);
                    return 0;
                case 2:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        di diVar = new di();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = diVar.populateBuilderWithField(aVar4, diVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        lgVar.vOM.add(diVar);
                    }
                    AppMethodBeat.o(28347);
                    return 0;
                case 3:
                    lgVar.luT = aVar3.BTU.vd();
                    AppMethodBeat.o(28347);
                    return 0;
                case 4:
                    lgVar.luU = aVar3.BTU.readString();
                    AppMethodBeat.o(28347);
                    return 0;
                default:
                    AppMethodBeat.o(28347);
                    return -1;
            }
        } else {
            AppMethodBeat.o(28347);
            return -1;
        }
    }
}
