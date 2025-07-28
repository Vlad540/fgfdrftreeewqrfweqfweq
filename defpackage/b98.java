package defpackage;

import android.os.Bundle;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: b98  reason: default package */
public final class b98 implements z24 {
    public final /* synthetic */ int a;
    public final g34 b;

    public b98(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = cs5.b;
                return;
            case 2:
                this.b = ut6.b;
                return;
            case 3:
                this.b = va7.b;
                return;
            case 4:
                this.b = era.b;
                return;
            default:
                this.b = c98.b;
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
            default:
                return this.b;
        }
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        i iVar;
        i q63;
        i q62;
        i34 i34;
        i34 sa7;
        i34 i342;
        h34 h34;
        c34 c342 = c34;
        Bundle bundle2 = bundle;
        switch (this.a) {
            case 0:
                if (!this.b.a.contains(c342)) {
                    return null;
                }
                c98.b.getClass();
                if (c342.equals(c98.c)) {
                    return new j34(str, c34, bundle, 1, (h34) null, new i(23), 16);
                }
                udd.s(b98.class.getName(), "invalid route " + c342, new IllegalArgumentException("invalid route " + c342));
                return null;
            case 1:
                if (!this.b.a.contains(c342)) {
                    return null;
                }
                cs5.b.getClass();
                if (c342.equals(cs5.c)) {
                    q62 = new i(17);
                } else if (c342.equals(cs5.e)) {
                    q62 = new q62(bundle2, 3);
                } else {
                    if (c342.equals(cs5.f)) {
                        Long t0 = x87.t0("chat_id", bundle2);
                        q63 = new q63(t0 != null ? t0.longValue() : 0, 1);
                    } else if (c342.equals(cs5.h)) {
                        String string = bundle2.getString("folder_id");
                        String str2 = "";
                        if (string == null) {
                            string = str2;
                        }
                        String string2 = bundle2.getString("tag");
                        if (string2 != null) {
                            str2 = string2;
                        }
                        iVar = new mp5(string, str2, x87.u0("members_ids", bundle2));
                        return new j34(str, c34, bundle, 0, (h34) null, iVar, 24);
                    } else if (c342.equals(cs5.d)) {
                        q62 = new q62(bundle2, 4);
                    } else if (!c342.equals(cs5.g)) {
                        return null;
                    } else {
                        q63 = new q63(x87.E0(ApiProtocol.KEY_ID, bundle2), 2);
                    }
                    iVar = q63;
                    return new j34(str, c34, bundle, 0, (h34) null, iVar, 24);
                }
                iVar = q62;
                return new j34(str, c34, bundle, 0, (h34) null, iVar, 24);
            case 2:
                if (!this.b.a.contains(c342)) {
                    return null;
                }
                ut6.b.getClass();
                if (c342.equals(ut6.c)) {
                    return new j34(str, c34, bundle, 1, new h34(new fs5(14), new fs5(15)), new i(18));
                }
                throw new IllegalStateException(hr1.f("invalid route ", c342));
            case 3:
                Float f = null;
                if (!this.b.a.contains(c342)) {
                    return null;
                }
                boolean z = true;
                long j = 0;
                if (c342.equals(va7.c)) {
                    dm7 dm7 = new dm7(x87.C0("lat", bundle2), x87.C0("lon", bundle2));
                    String string3 = bundle2.getString("z");
                    if (string3 != null) {
                        f = Float.valueOf(Float.parseFloat(string3));
                    }
                    float floatValue = f != null ? f.floatValue() : 0.0f;
                    Long t02 = x87.t0("chat_id", bundle2);
                    long longValue = t02 != null ? t02.longValue() : 0;
                    Long t03 = x87.t0("msg_id", bundle2);
                    if (t03 != null) {
                        j = t03.longValue();
                    }
                    sa7 = new ua7(longValue, j, dm7, floatValue, x87.t0("sender_id", bundle2));
                } else if (c342.equals(va7.d)) {
                    int D0 = x87.D0("request_code", bundle2);
                    Long t04 = x87.t0("chat_id", bundle2);
                    if (t04 != null) {
                        j = t04.longValue();
                    }
                    sa7 = new sa7(D0, j);
                } else if (c342.equals(va7.e)) {
                    String G0 = x87.G0("attachment_id", bundle2);
                    xm8 xm8 = ((nr8) bundle2.getParcelable("message")).a;
                    Boolean s0 = x87.s0("single_attach", bundle2);
                    boolean booleanValue = s0 != null ? s0.booleanValue() : true;
                    Boolean s02 = x87.s0("desc_order", bundle2);
                    boolean booleanValue2 = s02 != null ? s02.booleanValue() : false;
                    Boolean s03 = x87.s0("start_auto_play", bundle2);
                    boolean booleanValue3 = s03 != null ? s03.booleanValue() : true;
                    Boolean s04 = x87.s0("cast_enabled", bundle2);
                    if (s04 != null) {
                        z = s04.booleanValue();
                    }
                    i34 = new ra7(xm8, G0, booleanValue2, booleanValue, booleanValue3, z);
                    z = true;
                    return new j34(str, c34, bundle, z ? 1 : 0, (h34) null, i34, 16);
                } else {
                    throw new IllegalStateException(hr1.f("unknown route ", c342));
                }
                i34 = sa7;
                return new j34(str, c34, bundle, z ? 1 : 0, (h34) null, i34, 16);
            default:
                if (!this.b.a.contains(c342)) {
                    return null;
                }
                h34 h342 = h34.c;
                if (c342.equals(era.c)) {
                    h34 = h342;
                    i342 = new q62(bundle2, 7);
                } else if (c342.equals(era.d)) {
                    h34 = new h34(new qga(5), new qga(6));
                    i342 = new dra(x87.D0("request_code", bundle2));
                } else {
                    throw new IllegalStateException(hr1.f("invalid route ", c342));
                }
                return new j34(str, c34, bundle, 1, h34, i342);
        }
    }
}
