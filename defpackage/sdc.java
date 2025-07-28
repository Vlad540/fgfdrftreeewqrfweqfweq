package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: sdc  reason: default package */
public final class sdc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pec b;
    public final /* synthetic */ udc c;

    public /* synthetic */ sdc(udc udc, pec pec, int i) {
        this.a = i;
        this.c = udc;
        this.b = pec;
    }

    public final Object call() {
        int i;
        ArrayList arrayList;
        pec pec;
        int i2;
        ArrayList arrayList2;
        pec pec2;
        int i3;
        ArrayList arrayList3;
        Long l;
        ArrayList arrayList4 = hw4.a;
        pec pec3 = this.b;
        ArrayList arrayList5 = arrayList4;
        udc udc = this.c;
        switch (this.a) {
            case 0:
                String str = "isRemoved";
                Cursor o = udc.a.o(pec3, (CancellationSignal) null);
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
                    int o14 = gp0.o(o, str);
                    ArrayList arrayList6 = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        String string = o.isNull(o2) ? null : o.getString(o2);
                        String string2 = o.isNull(o3) ? null : o.getString(o3);
                        String string3 = o.isNull(o4) ? null : o.getString(o4);
                        int i4 = o.getInt(o5);
                        EnumSet M = kjd.M(o.isNull(o6) ? null : o.getString(o6));
                        boolean z = o.getInt(o7) != 0;
                        boolean z2 = o.getInt(o8) != 0;
                        byte[] blob = o.isNull(o9) ? null : o.getBlob(o9);
                        if (blob != null) {
                            i = o2;
                            Protos.MessageElements messageElements = new Protos.MessageElements();
                            gr8.mergeFrom(messageElements, blob);
                            arrayList = gp8.a(messageElements);
                        } else {
                            i = o2;
                            arrayList = arrayList5;
                        }
                        arrayList6.add(new hdc(string, string2, string3, i4, (Set) M, z, z2, (List) arrayList, o.isNull(o10) ? null : Long.valueOf(o.getLong(o10)), kjd.t(o.isNull(o11) ? null : o.getBlob(o11)), kjd.v(o.isNull(o12) ? null : o.getBlob(o12)), kjd.u(o.isNull(o13) ? null : o.getBlob(o13)), o.getInt(o14) != 0));
                        o2 = i;
                    }
                    return arrayList6;
                } finally {
                    o.close();
                }
            case 1:
                pec pec4 = pec3;
                String str2 = "isRemoved";
                Cursor o15 = udc.a.o(pec3, (CancellationSignal) null);
                try {
                    int o16 = gp0.o(o15, ApiProtocol.KEY_ID);
                    int o17 = gp0.o(o15, "title");
                    int o18 = gp0.o(o15, "emoji");
                    int o19 = gp0.o(o15, "order");
                    int o20 = gp0.o(o15, "filters");
                    int o21 = gp0.o(o15, "isHiddenForAllFolder");
                    int o22 = gp0.o(o15, "hideIfEmpty");
                    int o23 = gp0.o(o15, "elements");
                    int o24 = gp0.o(o15, "creatorId");
                    int o25 = gp0.o(o15, "filterSubjects");
                    int o26 = gp0.o(o15, "widgets");
                    int o27 = gp0.o(o15, "options");
                    int o28 = gp0.o(o15, str2);
                    pec = pec3;
                    try {
                        ArrayList arrayList7 = new ArrayList(o15.getCount());
                        while (o15.moveToNext()) {
                            String string4 = o15.isNull(o16) ? null : o15.getString(o16);
                            String string5 = o15.isNull(o17) ? null : o15.getString(o17);
                            String string6 = o15.isNull(o18) ? null : o15.getString(o18);
                            int i5 = o15.getInt(o19);
                            EnumSet M2 = kjd.M(o15.isNull(o20) ? null : o15.getString(o20));
                            boolean z3 = o15.getInt(o21) != 0;
                            boolean z4 = o15.getInt(o22) != 0;
                            byte[] blob2 = o15.isNull(o23) ? null : o15.getBlob(o23);
                            if (blob2 != null) {
                                i2 = o16;
                                Protos.MessageElements messageElements2 = new Protos.MessageElements();
                                gr8.mergeFrom(messageElements2, blob2);
                                arrayList2 = gp8.a(messageElements2);
                            } else {
                                i2 = o16;
                                arrayList2 = arrayList5;
                            }
                            arrayList7.add(new hdc(string4, string5, string6, i5, (Set) M2, z3, z4, (List) arrayList2, o15.isNull(o24) ? null : Long.valueOf(o15.getLong(o24)), kjd.t(o15.isNull(o25) ? null : o15.getBlob(o25)), kjd.v(o15.isNull(o26) ? null : o15.getBlob(o26)), kjd.u(o15.isNull(o27) ? null : o15.getBlob(o27)), o15.getInt(o28) != 0));
                            o16 = i2;
                        }
                        o15.close();
                        pec.m();
                        return arrayList7;
                    } catch (Throwable th) {
                        th = th;
                        o15.close();
                        pec.m();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    pec = pec3;
                    o15.close();
                    pec.m();
                    throw th;
                }
            case 2:
                Cursor o29 = udc.a.o(pec3, (CancellationSignal) null);
                try {
                    int o30 = gp0.o(o29, ApiProtocol.KEY_ID);
                    int o31 = gp0.o(o29, "title");
                    int o32 = gp0.o(o29, "emoji");
                    int o33 = gp0.o(o29, "order");
                    int o34 = gp0.o(o29, "filters");
                    int o35 = gp0.o(o29, "isHiddenForAllFolder");
                    int o36 = gp0.o(o29, "hideIfEmpty");
                    int o37 = gp0.o(o29, "elements");
                    int o38 = gp0.o(o29, "creatorId");
                    int o39 = gp0.o(o29, "filterSubjects");
                    int o40 = gp0.o(o29, "widgets");
                    int o41 = gp0.o(o29, "options");
                    int o42 = gp0.o(o29, "isRemoved");
                    pec2 = pec3;
                    try {
                        ArrayList arrayList8 = new ArrayList(o29.getCount());
                        while (o29.moveToNext()) {
                            String string7 = o29.isNull(o30) ? null : o29.getString(o30);
                            String string8 = o29.isNull(o31) ? null : o29.getString(o31);
                            String string9 = o29.isNull(o32) ? null : o29.getString(o32);
                            int i6 = o29.getInt(o33);
                            EnumSet M3 = kjd.M(o29.isNull(o34) ? null : o29.getString(o34));
                            boolean z5 = o29.getInt(o35) != 0;
                            boolean z6 = o29.getInt(o36) != 0;
                            byte[] blob3 = o29.isNull(o37) ? null : o29.getBlob(o37);
                            if (blob3 != null) {
                                i3 = o30;
                                Protos.MessageElements messageElements3 = new Protos.MessageElements();
                                gr8.mergeFrom(messageElements3, blob3);
                                arrayList3 = gp8.a(messageElements3);
                            } else {
                                i3 = o30;
                                arrayList3 = arrayList5;
                            }
                            arrayList8.add(new hdc(string7, string8, string9, i6, (Set) M3, z5, z6, (List) arrayList3, o29.isNull(o38) ? null : Long.valueOf(o29.getLong(o38)), kjd.t(o29.isNull(o39) ? null : o29.getBlob(o39)), kjd.v(o29.isNull(o40) ? null : o29.getBlob(o40)), kjd.u(o29.isNull(o41) ? null : o29.getBlob(o41)), o29.getInt(o42) != 0));
                            o30 = i3;
                        }
                        o29.close();
                        pec2.m();
                        return arrayList8;
                    } catch (Throwable th3) {
                        th = th3;
                        o29.close();
                        pec2.m();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    pec2 = pec3;
                    o29.close();
                    pec2.m();
                    throw th;
                }
            case 3:
                Cursor o43 = udc.a.o(pec3, (CancellationSignal) null);
                try {
                    if (o43.moveToFirst()) {
                        if (!o43.isNull(0)) {
                            l = Long.valueOf(o43.getLong(0));
                            return l;
                        }
                    }
                    l = null;
                    return l;
                } finally {
                    o43.close();
                    pec3.m();
                }
            default:
                Cursor o44 = udc.a.o(pec3, (CancellationSignal) null);
                try {
                    return (!o44.moveToFirst() || o44.isNull(0)) ? null : o44.getBlob(0);
                } finally {
                    o44.close();
                    pec3.m();
                }
        }
    }

    public void finalize() {
        switch (this.a) {
            case 0:
                this.b.m();
                return;
            default:
                super.finalize();
                return;
        }
    }
}
