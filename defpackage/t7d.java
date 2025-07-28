package defpackage;

import android.os.Bundle;

/* renamed from: t7d  reason: default package */
public final class t7d implements z24 {
    public final /* synthetic */ int a;
    public final g34 b;

    public t7d(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = gf4.b;
                return;
            case 2:
                this.b = fv5.b;
                return;
            case 3:
                this.b = y07.b;
                return;
            case 4:
                this.b = lp7.b;
                return;
            case 5:
                this.b = nq9.b;
                return;
            case 6:
                this.b = uad.b;
                return;
            default:
                this.b = u7d.b;
                return;
        }
    }

    public final g34 a() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case 2:
                return this.b;
            case 3:
                return this.b;
            case 4:
                return this.b;
            case 5:
                return this.b;
            default:
                return this.b;
        }
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        i iVar;
        i iVar2;
        switch (this.a) {
            case 0:
                if (!this.b.a.contains(c34)) {
                    return null;
                }
                u7d.b.getClass();
                if (c34.equals(u7d.c)) {
                    return new j34(str, c34, bundle, 1, new h34(new vfc(13), new vfc(14)), new i(29));
                }
                udd.s(t7d.class.getName(), "invalid route " + c34, new IllegalArgumentException("invalid route " + c34));
                return null;
            case 1:
                if (!this.b.a.contains(c34)) {
                    return null;
                }
                if (c34.equals(gf4.c) || c34.equals(gf4.g)) {
                    iVar = new i(11);
                } else if (c34.equals(gf4.d)) {
                    iVar = new i(12);
                } else if (c34.equals(gf4.h)) {
                    iVar = new i(13);
                } else if (c34.equals(gf4.i)) {
                    iVar = new i(14);
                } else if (c34.equals(gf4.e)) {
                    iVar = new i(15);
                } else if (c34.equals(gf4.f)) {
                    iVar = new i(16);
                } else {
                    throw new IllegalStateException(hr1.f("Unknown route=", c34));
                }
                return new j34(str, c34, bundle, 0, (c34.equals(gf4.i) || c34.equals(gf4.h)) ? h34.c : new h34(), iVar, 8);
            case 2:
                if (!this.b.a.contains(c34)) {
                    return null;
                }
                if (c34.equals(fv5.c)) {
                    long[] F0 = x87.F0("messages_ids", bundle);
                    Long t0 = x87.t0("attach_id", bundle);
                    Boolean s0 = x87.s0("is_forward_attach", bundle);
                    boolean z = false;
                    boolean booleanValue = s0 != null ? s0.booleanValue() : false;
                    Boolean s02 = x87.s0("show_ext_sharing", bundle);
                    if (s02 != null) {
                        z = s02.booleanValue();
                    }
                    return new j34(str, c34, bundle, 1, (h34) null, new ev5(F0, t0, booleanValue, z), 16);
                }
                throw new IllegalStateException(hr1.f("invalid route ", c34));
            case 3:
                if (!this.b.a.contains(c34)) {
                    return null;
                }
                y07.b.getClass();
                if (c34.equals(y07.c)) {
                    return new j34(str, c34, bundle, 1, (h34) null, new i(19), 16);
                } else if (c34.equals(y07.d)) {
                    return new j34(str, c34, bundle, 1, new h34(new fs5(19), new fs5(20)), new i(20));
                } else {
                    throw new IllegalStateException(hr1.f("invalid route ", c34));
                }
            case 4:
                this.b.getClass();
                if (!c34.equals(lp7.c)) {
                    return null;
                }
                return new j34(str, c34, bundle, 0, new h34(new ib7(9), new ib7(10)), new i(22), 8);
            case 5:
                if (!this.b.a.contains(c34)) {
                    return null;
                }
                if (c34.equals(nq9.c)) {
                    iVar2 = new i(25);
                } else if (c34.equals(nq9.d)) {
                    iVar2 = new i(26);
                } else if (c34.equals(nq9.e)) {
                    iVar2 = new i(27);
                } else if (c34.equals(nq9.f)) {
                    iVar2 = new i(28);
                } else {
                    throw new IllegalStateException("Unknown route".toString());
                }
                return new j34(str, c34, bundle, 0, (h34) null, iVar2, 24);
            default:
                if (!this.b.a.contains(c34)) {
                    return null;
                }
                uad.b.getClass();
                if (c34.equals(uad.c)) {
                    return new j34(str, c34, bundle, 1, (h34) null, new q62(bundle, 8), 16);
                }
                throw new IllegalStateException(hr1.f("invalid route ", c34));
        }
    }
}
