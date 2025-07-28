package defpackage;

import android.os.Bundle;
import java.util.NoSuchElementException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: b8b  reason: default package */
public final class b8b implements z24 {
    public final /* synthetic */ int a;
    public final t97 b;
    public final g34 c;

    public b8b(int i, t97 t97) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = xif.b;
                this.b = t97;
                return;
            default:
                this.b = t97;
                this.c = e8b.b;
                return;
        }
    }

    public final g34 a() {
        switch (this.a) {
            case 0:
                return this.c;
            default:
                return this.c;
        }
    }

    public final j34 b(String str, c34 c34, Bundle bundle) {
        i34 i34;
        i34 a8b;
        c8b c8b;
        i34 q63;
        bff bff;
        c34 c342 = c34;
        Bundle bundle2 = bundle;
        switch (this.a) {
            case 0:
                if (!this.c.a.contains(c342)) {
                    return null;
                }
                e8b.b.getClass();
                if (c342.equals(e8b.c)) {
                    long E0 = x87.E0(ApiProtocol.KEY_ID, bundle2);
                    lu7 lu7 = d8b.b;
                    String G0 = x87.G0("type", bundle2);
                    lu7.getClass();
                    i34 = new o6b(E0, lu7.k(G0), 1);
                } else if (c342.equals(e8b.d)) {
                    i34 = new q63(x87.E0(ApiProtocol.KEY_ID, bundle2), 8);
                } else {
                    if (c342.equals(e8b.e)) {
                        long E02 = x87.E0(ApiProtocol.KEY_ID, bundle2);
                        lu7 lu72 = d8b.b;
                        String G02 = x87.G0("type", bundle2);
                        lu72.getClass();
                        d8b k = lu7.k(G02);
                        if (k == d8b.CONTACT) {
                            vqc vqc = (vqc) ((xzc) this.b.getValue());
                            vqc.getClass();
                            if (!vqc.m(PmsKey.f1accountnicknameenabled, false)) {
                                return null;
                            }
                        }
                        ns7 ns7 = c8b.b;
                        String G03 = x87.G0("flow", bundle2);
                        ns7.getClass();
                        u1 it = c8b.X.iterator();
                        do {
                            u1 u1Var = it;
                            if (u1Var.hasNext()) {
                                c8b = (c8b) u1Var.next();
                            } else {
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        } while (!hhd.f(c8b.a, G03));
                        a8b = new m6b(E02, k, c8b);
                    } else if (c342.equals(e8b.f)) {
                        a8b = new a8b(x87.E0("chat_id", bundle2), x87.G0("permissions_type", bundle2), x87.E0("contact_id", bundle2));
                    } else {
                        udd.s(b8b.class.getName(), "invalid route " + c342, new IllegalArgumentException("invalid route " + c342));
                        return null;
                    }
                    i34 = a8b;
                }
                return new j34(str, c34, bundle, 1, (h34) null, i34, 16);
            default:
                Integer num = null;
                if (!this.c.a.contains(c342)) {
                    return null;
                }
                h34 h34 = new h34();
                xif.b.getClass();
                if (c342.equals(xif.c)) {
                    h34 = new h34(new vif(0), new vif(1));
                    long E03 = x87.E0("bot_id", bundle2);
                    qr4 qr4 = bff.c;
                    String G04 = x87.G0("entry_point", bundle2);
                    qr4.getClass();
                    u1 it2 = bff.y0.iterator();
                    do {
                        u1 u1Var2 = it2;
                        if (u1Var2.hasNext()) {
                            bff = (bff) u1Var2.next();
                        } else {
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    } while (!hhd.f(bff.a, G04));
                    Long t0 = x87.t0("chat_id", bundle2);
                    String string = bundle2.getString("start_param");
                    Boolean s0 = x87.s0("is_fullscreen", bundle2);
                    boolean booleanValue = s0 != null ? s0.booleanValue() : ((i03) ((f03) this.b.getValue())).g.getBoolean("app.toggle.webapp_fullscreen", false);
                    String string2 = bundle2.getString("request_code");
                    if (string2 != null) {
                        num = Integer.valueOf(Integer.parseInt(string2));
                    }
                    q63 = new wif(E03, bff, t0, string, booleanValue, num != null ? num.intValue() : 0);
                } else if (c342.equals(xif.d)) {
                    q63 = new g8d(7);
                } else if (c342.equals(xif.e)) {
                    q63 = new q63(x87.E0("bot_id", bundle2), 11);
                } else {
                    throw new IllegalStateException(hr1.f("invalid route ", c342));
                }
                return new j34(str, c34, bundle, 1, h34, q63);
        }
    }
}
