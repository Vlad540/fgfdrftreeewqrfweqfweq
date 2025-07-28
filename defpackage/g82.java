package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: g82  reason: default package */
public final class g82 extends l5e implements i26 {
    public final /* synthetic */ b92 X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g82(b92 b92, String str, Continuation continuation) {
        super(2, continuation);
        this.X = b92;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new g82(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        hdc hdc;
        ArrayList arrayList;
        wx3.H(obj);
        String str = b92.O0;
        b92 b92 = this.X;
        udc e = b92.e();
        e.getClass();
        pec a = pec.a(1, "SELECT * FROM chat_folder WHERE id = ?");
        String str2 = this.Y;
        if (str2 == null) {
            a.W(1);
        } else {
            a.f(1, str2);
        }
        aec aec = e.a;
        aec.b();
        Cursor o = aec.o(a, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
            int o3 = gp0.o(o, "title");
            int o4 = gp0.o(o, "emoji");
            int o5 = gp0.o(o, "order");
            int o6 = gp0.o(o, "filters");
            int o7 = gp0.o(o, "isHiddenForAllFolder");
            int o8 = gp0.o(o, "hideIfEmpty");
            int o9 = gp0.o(o, "elements");
            int o10 = gp0.o(o, "creatorId");
            int o11 = gp0.o(o, "filterSubjects");
            int o12 = gp0.o(o, "widgets");
            int o13 = gp0.o(o, "options");
            String str3 = str2;
            int o14 = gp0.o(o, "isRemoved");
            if (o.moveToFirst()) {
                String string = o.isNull(o2) ? null : o.getString(o2);
                String string2 = o.isNull(o3) ? null : o.getString(o3);
                String string3 = o.isNull(o4) ? null : o.getString(o4);
                int i = o.getInt(o5);
                EnumSet M = kjd.M(o.isNull(o6) ? null : o.getString(o6));
                boolean z = o.getInt(o7) != 0;
                boolean z2 = o.getInt(o8) != 0;
                byte[] blob = o.isNull(o9) ? null : o.getBlob(o9);
                if (blob != null) {
                    Protos.MessageElements messageElements = new Protos.MessageElements();
                    gr8.mergeFrom(messageElements, blob);
                    arrayList = gp8.a(messageElements);
                } else {
                    arrayList = hw4.a;
                }
                hdc = new hdc(string, string2, string3, i, (Set) M, z, z2, (List) arrayList, o.isNull(o10) ? null : Long.valueOf(o.getLong(o10)), kjd.t(o.isNull(o11) ? null : o.getBlob(o11)), kjd.v(o.isNull(o12) ? null : o.getBlob(o12)), kjd.u(o.isNull(o13) ? null : o.getBlob(o13)), o.getInt(o14) != 0);
            } else {
                hdc = null;
            }
            if (hdc == null) {
                return null;
            }
            ArrayList e2 = b92.e().e(str3);
            qw4 qw4 = qw4.a;
            return hdc.a(e2, qw4, qw4, (v6a) b92.o.getValue());
        } finally {
            o.close();
            a.m();
        }
    }
}
