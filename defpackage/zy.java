package defpackage;

import java.util.ArrayList;
import java.util.Objects;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: zy  reason: default package */
public final class zy extends ArrayList {
    public static final /* synthetic */ int a = 0;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.ArrayList, zy] */
    public static zy a(ws8 ws8) {
        ? arrayList = new ArrayList();
        int s0 = ws8.s0();
        for (int i = 0; i < s0; i++) {
            arrayList.add(fy.b(ws8));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.ArrayList, zy] */
    public static zy b(ws8 ws8) {
        int s0 = ws8.s0();
        ? arrayList = new ArrayList(s0);
        for (int i = 0; i < s0; i++) {
            arrayList.add(j22.a(ws8));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.ArrayList, zy] */
    public static zy c(ws8 ws8) {
        int D = jjd.D(ws8);
        ? arrayList = new ArrayList(D);
        for (int i = 0; i < D; i++) {
            uj3 e = uj3.e(ws8);
            uj3 uj3 = sj3.E0;
            if (e == null) {
                Objects.requireNonNull(uj3, "defaultObj");
                e = uj3;
            }
            arrayList.add(e);
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.ArrayList, zy] */
    public static zy d(ws8 ws8) {
        int D = jjd.D(ws8);
        ? arrayList = new ArrayList(D);
        for (int i = 0; i < D; i++) {
            arrayList.add(Long.valueOf(jjd.J(ws8, 0)));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.ArrayList, zy] */
    public static zy e(ws8 ws8) {
        ? arrayList = new ArrayList();
        int D = jjd.D(ws8);
        for (int i = 0; i < D; i++) {
            arrayList.add(hhd.H(ws8));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.AbstractCollection, java.util.ArrayList, zy] */
    public static zy f(ws8 ws8) {
        int D = jjd.D(ws8);
        ? arrayList = new ArrayList(D);
        for (int i = 0; i < D; i++) {
            int K = jjd.K(ws8);
            ym8 ym8 = null;
            String str = null;
            ArrayList arrayList2 = null;
            long j = 0;
            for (int i2 = 0; i2 < K; i2++) {
                String z0 = ws8.z0();
                z0.getClass();
                char c = 65535;
                switch (z0.hashCode()) {
                    case -1361631597:
                        if (z0.equals(ApiProtocol.PARAM_CHAT_ID)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -191501435:
                        if (z0.equals("feedback")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 357304895:
                        if (z0.equals("highlights")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 954925063:
                        if (z0.equals("message")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        j = ws8.w0();
                        break;
                    case 1:
                        str = ws8.z0();
                        break;
                    case 2:
                        int D2 = jjd.D(ws8);
                        ArrayList arrayList3 = new ArrayList(D2);
                        for (int i3 = 0; i3 < D2; i3++) {
                            arrayList3.add(ws8.z0());
                        }
                        arrayList2 = arrayList3;
                        break;
                    case 3:
                        ym8 = hhd.H(ws8);
                        break;
                    default:
                        ws8.z();
                        break;
                }
            }
            ds8 ds8 = new ds8(str, arrayList2, j, ym8);
            if (ym8 != null) {
                arrayList.add(ds8);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.ArrayList, zy] */
    public static zy g(ws8 ws8) {
        int D = jjd.D(ws8);
        ? arrayList = new ArrayList(D);
        for (int i = 0; i < D; i++) {
            arrayList.add(jjd.M(ws8));
        }
        return arrayList;
    }
}
