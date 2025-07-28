package defpackage;

import android.util.SparseIntArray;
import android.view.Surface;
import android.view.WindowInsetsAnimation;
import com.facebook.fresco.middleware.HasExtraData;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;
import me.leolin.shortcutbadger.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: s5c  reason: default package */
public final class s5c implements i36, iae, j26, nn1, hx9 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ s5c(int i, boolean z) {
        this.a = i;
    }

    public void a(Object obj) {
        hx4 hx4;
        hx4 hx42 = (hx4) obj;
        Objects.toString(hx42);
        if (hx42 != null) {
            y5c y5c = (y5c) this.c;
            ScheduledFuture scheduledFuture = y5c.Y;
            if (scheduledFuture != null && scheduledFuture.cancel(false) && (hx4 = y5c.F) != null && hx4 == hx42) {
                y5c.r(hx4);
            }
            y5c.b0 = (vj4) this.b;
            y5c.A((Surface) null);
            y5c.v(y5c.o());
        }
    }

    public Object apply(Object obj) {
        return kd8.l((kd8) this.b, (dh2) obj, (String) this.c);
    }

    public void b() {
        int[] iArr = (int[]) this.b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.c = null;
    }

    public void c(lbe lbe) {
        lbe lbe2;
        int indexOf;
        int indexOf2;
        lbe lbe3 = lbe;
        kia kia = (kia) this.b;
        short s = kia.d;
        jk9 jk9 = dfa.c;
        s1d s1d = (s1d) this.c;
        if (s == 1) {
            bce bce = s1d.b.t;
            bce.getClass();
            udd.p("bce", "onPing", new Object[0]);
            ybe ybe = bce.o;
            if (ybe != null) {
                ((dce) ybe.B0.getValue()).h();
            }
            u1d.b(s1d.b, new kia((byte) 1, kia.c, kia.d, kia.h, 0));
        } else if (s == 2) {
            bce bce2 = s1d.b.t;
            bce2.getClass();
            bce2.a(new ace(bce2, 1, (q14) lbe3));
        } else if (s == 20) {
            bce bce3 = s1d.b.t;
            if (bce3.o != null) {
                udd.p("bce", "onLogout", new Object[0]);
                ((ExecutorService) bce3.o.C0.getValue()).execute(new pzb(28, bce3));
            }
        } else if (s == 3) {
            boolean z = lbe3 == lbe.b;
            bce bce4 = s1d.b.t;
            if (z) {
                lbe2 = new lbe();
                lbe2.o = true;
            } else {
                lbe2 = (x2c) lbe3;
            }
            bce bce5 = bce4;
            bce5.getClass();
            String str = null;
            udd.p("bce", "onReconnect: host=%s port=%s", (r1g.p(lbe2.c) || (indexOf2 = lbe2.c.indexOf(":")) <= 0) ? null : lbe2.c.substring(0, indexOf2), lbe2.c());
            if (!r1g.p(lbe2.c)) {
                j2b j2b = bce5.a;
                i03 i03 = j2b.a;
                if (!r1g.p(lbe2.c) && (indexOf = lbe2.c.indexOf(":")) > 0) {
                    str = lbe2.c.substring(0, indexOf);
                }
                i03.l("server.host", str);
                j2b.a.l("server.port", lbe2.c());
                j2b.a.i("server.useTls", lbe2.o);
            }
            ybe ybe2 = bce5.o;
            ybe2.getClass();
            udd.p(ybe.F0, "restart", new Object[0]);
            u1d u1d = (u1d) ((dce) ybe2.B0.getValue()).Z.get();
            if (u1d != null) {
                u1d.n(false);
            }
            ((ExecutorService) ybe2.D0.getValue()).execute(new pzb(27, ybe2));
        } else {
            dfa dfa = dfa.K1;
            if (s == dfa.a) {
                ypc ypc = s1d.b.n;
                ypc.getClass();
                if (!((f03) ypc.a.c(f03.class)).E()) {
                    cm9 cm9 = (cm9) lbe3;
                    u1d u1d2 = s1d.b;
                    bm9 bm9 = new bm9(dfa, 0);
                    bm9.n(cm9.c, "chatId");
                    ym8 ym8 = cm9.X;
                    bm9.n(ym8.a, "messageId");
                    if (ym8.y0 == vs8.o) {
                        bm9.s("chatType", "GROUP_CHAT");
                    }
                    u1d.b(u1d2, kia.a(bm9, (byte) 1, kia.c));
                    bce bce6 = s1d.b.t;
                    bce6.getClass();
                    bce6.a(new sz(bce6, 27, cm9));
                }
            } else if (s == dfa.M1.a) {
                bce bce7 = s1d.b.t;
                bce7.getClass();
                bce7.a(new sz(bce7, 25, (zl9) lbe3));
                ((dce) bce7.o.B0.getValue()).h();
            } else if (s == dfa.L1.a) {
                bce bce8 = s1d.b.t;
                bce8.getClass();
                bce8.a(new sz(bce8, 21, (tm9) lbe3));
            } else if (s == dfa.O1.a) {
                bce bce9 = s1d.b.t;
                bce9.getClass();
                bce9.a(new sz(bce9, 28, (sm9) lbe3));
            } else if (s == dfa.N1.a) {
                bce bce10 = s1d.b.t;
                bce10.getClass();
                bce10.a(new sz(bce10, 16, (ql9) lbe3));
            } else if (s == dfa.P1.a) {
                bce bce11 = s1d.b.t;
                bce11.getClass();
                bce11.a(new sz(bce11, 17, (ol9) lbe3));
            } else if (s == dfa.Q1.a) {
                bce bce12 = s1d.b.t;
                bce12.getClass();
                bce12.a(new sz(bce12, 20, (ml9) lbe3));
            } else if (s == dfa.R1.a) {
                bce bce13 = s1d.b.t;
                bce13.getClass();
                bce13.a(new sz(bce13, 26, (il9) lbe3));
            } else if (s == dfa.S1.a) {
                jl9 jl9 = (jl9) lbe3;
                bce bce14 = s1d.b.t;
                if (!((h0a) bce14.j.getValue()).a()) {
                    bce14.a(new ace(bce14, 2, new df1(jl9.X, jl9.Y, jl9.c, BuildConfig.FLAVOR, BuildConfig.FLAVOR, jl9.x0 == 3, jl9.o)));
                }
            } else if (s == dfa.T1.a) {
                bce bce15 = s1d.b.t;
                bce15.getClass();
                bce15.a(new sz(bce15, 22, (rl9) lbe3));
            } else if (s == dfa.U1.a) {
                bce bce16 = s1d.b.t;
                bce16.getClass();
                bce16.a(new ace(bce16, 3, (nm9) lbe3));
            } else if (s == dfa.V1.a) {
                bce bce17 = s1d.b.t;
                bce17.getClass();
                bce17.a(new sz(bce17, 18, (lm9) lbe3));
            } else if (s == dfa.W1.a) {
                bce bce18 = s1d.b.t;
                bce18.getClass();
                bce18.a(new sz(bce18, 29, (pm9) lbe3));
            } else if (s == dfa.X1.a) {
                bce bce19 = s1d.b.t;
                bce19.getClass();
                bce19.a(new sz(bce19, 14, (rm9) lbe3));
            } else if (s == dfa.Y1.a) {
                bce bce20 = s1d.b.t;
                bce20.getClass();
                bce20.a(new sz(bce20, 23, (kl9) lbe3));
            } else if (s == dfa.c2.a) {
                bce bce21 = s1d.b.t;
                bce21.getClass();
                bce21.a(new f5(17, bce21));
            } else if (s == dfa.b2.a) {
                bce bce22 = s1d.b.t;
                bce22.getClass();
                bce22.a(new sz(bce22, 15, (xl9) lbe3));
            } else if (s == dfa.d2.a) {
                bce bce23 = s1d.b.t;
                bce23.getClass();
                bce23.a(new sz(bce23, 24, (hl9) lbe3));
            } else if (s == dfa.e2.a) {
                bce bce24 = s1d.b.t;
                bce24.getClass();
                bce24.a(new ace(bce24, 0, (tl9) lbe3));
            } else if (s == dfa.f2.a) {
                bce bce25 = s1d.b.t;
                bce25.getClass();
                bce25.a(new sz(bce25, 19, (ul9) lbe3));
            } else if (s == dfa.k2.a) {
                bce bce26 = s1d.b.t;
                bce26.getClass();
                bce26.a(new ace(bce26, 4, (fm9) lbe3));
            } else {
                dfa.c.getClass();
                String concat = "Illegal state in handleNotif, unknown opcode ".concat(jk9.l(s));
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(concat);
                udd.s(s1d.b.a, concat, illegalArgumentException);
                s1d.b.l(illegalArgumentException);
            }
        }
    }

    public void d(uae uae) {
        IllegalStateException illegalStateException = new IllegalStateException("illegal state in handleNotif, onFail", uae.X);
        s1d s1d = (s1d) this.c;
        udd.s(s1d.b.a, "illegal state in handleNotif, onFail", illegalStateException);
        s1d.b.l(illegalStateException);
    }

    public void e(Throwable th) {
        Objects.toString(th);
    }

    public long f() {
        return 0;
    }

    public void g(int i) {
        int[] iArr = (int[]) this.b;
        if (iArr == null) {
            int[] iArr2 = new int[(Math.max(i, 10) + 1)];
            this.b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int h(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r0.length
            if (r6 < r0) goto L_0x000c
            return r1
        L_0x000c:
            java.lang.Object r0 = r5.c
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0014
        L_0x0012:
            r0 = r1
            goto L_0x006f
        L_0x0014:
            r2 = 0
            if (r0 != 0) goto L_0x0018
            goto L_0x0033
        L_0x0018:
            int r0 = r0.size()
            int r0 = r0 + -1
        L_0x001e:
            if (r0 < 0) goto L_0x0033
            java.lang.Object r3 = r5.c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            jod r3 = (defpackage.jod) r3
            int r4 = r3.a
            if (r4 != r6) goto L_0x0030
            r2 = r3
            goto L_0x0033
        L_0x0030:
            int r0 = r0 + -1
            goto L_0x001e
        L_0x0033:
            if (r2 == 0) goto L_0x003c
            java.lang.Object r0 = r5.c
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L_0x003c:
            java.lang.Object r0 = r5.c
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L_0x0045:
            if (r2 >= r0) goto L_0x0059
            java.lang.Object r3 = r5.c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            jod r3 = (defpackage.jod) r3
            int r3 = r3.a
            if (r3 < r6) goto L_0x0056
            goto L_0x005a
        L_0x0056:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0059:
            r2 = r1
        L_0x005a:
            if (r2 == r1) goto L_0x0012
            java.lang.Object r0 = r5.c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            jod r0 = (defpackage.jod) r0
            java.lang.Object r3 = r5.c
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.a
        L_0x006f:
            if (r0 != r1) goto L_0x007f
            java.lang.Object r0 = r5.b
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r5 = r5.b
            int[] r5 = (int[]) r5
            int r5 = r5.length
            return r5
        L_0x007f:
            int r0 = r0 + 1
            java.lang.Object r2 = r5.b
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r5 = r5.b
            int[] r5 = (int[]) r5
            java.util.Arrays.fill(r5, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5c.h(int):int");
    }

    public void i(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            g(i3);
            int[] iArr2 = (int[]) this.b;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill((int[]) this.b, i, i3, -1);
            List list = (List) this.c;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    jod jod = (jod) ((List) this.c).get(size);
                    int i4 = jod.a;
                    if (i4 >= i) {
                        jod.a = i4 + i2;
                    }
                }
            }
        }
    }

    public void j(y0c y0c, xbc xbc) {
        int i;
        boolean m = xbc.m();
        f2b f2b = (f2b) this.b;
        if (m) {
            String U = xbc.Z.U();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(U);
                JSONObject jSONObject2 = jSONObject.getJSONObject("video");
                jSONObject2.getLong("duration");
                jSONObject2.getString("title");
                JSONObject jSONObject3 = jSONObject2.getJSONObject("owner");
                jSONObject3.optString("account_type");
                jSONObject3.optString("name");
                jSONObject3.optString("img");
                jSONObject3.optString("img_2x");
                jSONObject3.optString("url");
                jSONObject3.optLong(HasExtraData.KEY_ID);
                JSONObject jSONObject4 = jSONObject2.getJSONObject("thumbs");
                Iterator<String> keys = jSONObject4.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap2.put(next, jSONObject4.getString(next));
                }
                JSONArray jSONArray = jSONObject.getJSONObject("request").getJSONObject("files").getJSONArray("progressive");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject5 = jSONArray.getJSONObject(i2);
                    hashMap.put(jSONObject5.getString("quality"), jSONObject5.getString("url"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            ihd ihd = (ihd) ((nhd) f2b.b);
            if (!ihd.h()) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    try {
                        i = Integer.parseInt(str.replace("p", BuildConfig.FLAVOR));
                    } catch (Exception e2) {
                        udd.s("xcf", "failed to parse quality string: " + str, e2);
                        i = 0;
                    }
                    arrayList.add(new vb5(3, -1, i, 0, (String) entry.getValue()));
                }
                if (arrayList.isEmpty()) {
                    ihd.onError(new FetcherException(4, "No supported quality"));
                }
                ((xcf) f2b.c).getClass();
                ihd.a(new xb5("Vimeo", arrayList));
                return;
            }
            return;
        }
        ((cqc) this.c).getClass();
        int i3 = xbc.o;
        if (i3 == 403) {
            new IOException("Video has restricted playback");
        } else if (i3 != 404) {
            new IOException("An unknown error occurred");
        } else {
            new IOException("Video could not be found");
        }
        f2b.j();
    }

    public void k(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            g(i3);
            int[] iArr2 = (int[]) this.b;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = (int[]) this.b;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List list = (List) this.c;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    jod jod = (jod) ((List) this.c).get(size);
                    int i4 = jod.a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            ((List) this.c).remove(size);
                        } else {
                            jod.a = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    public void l(Task task) {
        r6g r6g = (r6g) this.b;
        vde vde = (vde) this.c;
        synchronized (r6g.f) {
            r6g.e.remove(vde);
        }
    }

    public void m(JSONObject jSONObject) {
        qec qec;
        f2b f2b = (f2b) this.c;
        f2b.getClass();
        egd egd = null;
        try {
            ge1 a2 = ge1.a(jSONObject.getString("initiatorId"));
            String x = r1g.x(jSONObject, "sharedUrl");
            ((jk9) f2b.c).getClass();
            qec = new qec(a2, x, jk9.q(jSONObject));
        } catch (JSONException e) {
            ((xwb) f2b.b).logException("UrlSharingParser", "Can't parse url sharing", e);
            qec = null;
        }
        if (qec != null) {
            String str = qec.b;
            if (str != null) {
                egd = new egd(qec.a, str);
            }
            ((kye) this.b).onUrlSharingInfoUpdated(new tl1(qec.c, egd));
        }
    }

    public void r(y0c y0c, IOException iOException) {
        ((f2b) this.b).j();
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "Bounds{lower=" + ((qy6) this.b) + " upper=" + ((qy6) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s5c(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ s5c(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public s5c(int i) {
        this.a = i;
        switch (i) {
            case 12:
                ma6 ma6 = ma6.d;
                this.b = new SparseIntArray();
                this.c = ma6;
                return;
            default:
                this.b = new ConcurrentHashMap();
                this.c = new ReferenceQueue();
                return;
        }
    }

    public s5c(String str) {
        this.a = 6;
        this.b = str;
        CharsetDecoder newDecoder = StandardCharsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        this.c = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public s5c(ryc ryc) {
        this.a = 9;
        this.b = ryc;
        this.c = new AtomicInteger(0);
    }

    public s5c(WindowInsetsAnimation.Bounds bounds) {
        this.a = 11;
        this.b = qy6.c(hia.B(bounds));
        this.c = qy6.c(hia.g(bounds));
    }
}
