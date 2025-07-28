package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import one.me.settings.privacy.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsApiRequest;
import ru.ok.tamtam.nano.Protos;

/* renamed from: sic  reason: default package */
public final /* synthetic */ class sic implements bid, vic, v1b, fhc, of3, otc, xz2, uw9, j26, a87, nf3, h67, tn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sic(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public nsf M(View view, nsf nsf) {
        up0 up0;
        rrd rrd = (rrd) this.b;
        if (rrd.g) {
            return nsf;
        }
        rrd.e = nsf;
        WindowInsets e = nsf.e();
        int i = 0;
        if (e != null) {
            if (Build.VERSION.SDK_INT < 31 || (up0 = rrd.b.b) == null || !up0.c) {
                e = null;
            }
            if (e != null) {
                RoundedCorner l = c88.l(e);
                int b2 = l != null ? p20.b(l) : 0;
                RoundedCorner B = c88.B(e);
                if (B != null) {
                    i = p20.b(B);
                }
                i = Math.max(b2 / 2, i / 2);
            }
        }
        rrd.f = i;
        rrd.c(nsf);
        return rrd.d(nsf);
    }

    public void a(ahc ahc, khc khc) {
        dac dac = (dac) ahc;
        izc izc = (izc) this.b;
        izc.getClass();
        Integer num = ((eac) khc).a;
        if (num != null) {
            izc.H0.a.edit().putInt("estimatedPerformanceIndex", num.intValue()).apply();
        }
    }

    public void accept(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 7:
                m00 m00 = (m00) obj;
                x00 x00 = m00.v;
                if (x00 == null) {
                    x00 = x00.j;
                }
                w00 a2 = x00.a();
                a2.a = (dm7) obj2;
                m00.v = a2.a();
                m00.i = g10.c;
                return;
            case Protos.Attaches.Attach.LOCATION:
                udd.s("lud", String.format(Locale.ENGLISH, "storeStickerSetsFromServer: failed for %s", new Object[]{(Collection) obj2}), (Throwable) obj);
                return;
            case 19:
                xw3 xw3 = (xw3) obj;
                m1e m1e = (m1e) obj2;
                m1e.getClass();
                long j = xw3.b;
                m1e.b.getClass();
                l1e l1e = new l1e(j, m54.k(xw3.c, xw3.a));
                m1e.o.add(l1e);
                long j2 = m1e.z0;
                if (j2 == -9223372036854775807L || xw3.b >= j2) {
                    m1e.a(l1e);
                    return;
                }
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                ((ts6) obj2).a((xw3) obj);
                return;
            case 27:
                udd.s("yfe", "process: failed for text " + ((CharSequence) obj2), (Throwable) obj);
                return;
            default:
                ((ne8) obj2).a((yfd) obj);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                Cursor cursor = (Cursor) obj;
                xic xic = (xic) this.b;
                xic.getClass();
                while (cursor.moveToNext()) {
                    xic.U((long) cursor.getInt(0), qn7.c, cursor.getString(1));
                }
                return null;
            case 13:
                osd osd = (osd) obj;
                zsd zsd = ((btd) this.b).b;
                zsd.a.put(Long.valueOf(osd.a), osd);
                tic.a(new sz(zsd, 12, osd), zsd.h, (j6) null, new xsd(0), (qmc) null);
                return dhd.g(osd);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                mud mud = (mud) obj;
                mud.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM sticker_sets WHERE id IN (");
                long[] jArr = (long[]) this.b;
                int length = jArr == null ? 1 : jArr.length;
                a06.e(sb, length);
                sb.append(")");
                pec a2 = pec.a(length, sb.toString());
                if (jArr == null) {
                    a2.W(1);
                } else {
                    int i = 1;
                    for (long j : jArr) {
                        a2.j(i, j);
                        i++;
                    }
                }
                return new ox7(new uh(mud, 25, a2));
            default:
                return ((ms9) obj).i(new ice((lce) this.b), Integer.MAX_VALUE);
        }
    }

    public boolean e(ClickableSpan clickableSpan, int i, int i2, String str, sf7 sf7, MotionEvent motionEvent) {
        switch (this.a) {
            case 10:
                xz2 onLinkLongClickListener = ((ubd) this.b).getOnLinkLongClickListener();
                return onLinkLongClickListener != null && onLinkLongClickListener.e(clickableSpan, i, i2, str, sf7, motionEvent);
            default:
                xz2 onLinkLongClickListener2 = ((vfe) this.b).getOnLinkLongClickListener();
                return onLinkLongClickListener2 != null && onLinkLongClickListener2.e(clickableSpan, i, i2, str, sf7, motionEvent);
        }
    }

    public int i(int i) {
        switch (this.a) {
            case 8:
                itc itc = (itc) ((pg7) ((SettingMediaScreen) this.b).X.C(i));
                int a2 = itc.a();
                if (itc.i()) {
                    return a2;
                }
                return 0;
            case 9:
                etc etc = (etc) ((pg7) ((SettingsPrivacyScreen) this.b).Y.C(i));
                int a3 = etc.a();
                if (etc.i()) {
                    return a3;
                }
                return 0;
            default:
                dtc dtc = (dtc) ((pg7) ((StickersSettingsScreen) this.b).X.C(i));
                if (dtc.a() != 0) {
                    return dtc.a();
                }
                return 0;
        }
    }

    public void j(ihd ihd) {
        switch (this.a) {
            case 0:
                ihd.a(((Callable) this.b).call());
                return;
            default:
                ((u16) ((pf8) this.b).e).invoke(new vqd(ihd));
                return;
        }
    }

    public Object parse(m67 m67) {
        return SupportedCodecsApiRequest._get_okParser_$lambda$0((SupportedCodecsApiRequest) this.b, m67);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 4:
                rwc rwc = (rwc) obj;
                if (!ek8.f((Set) this.b, new sic(5, rwc))) {
                    tk7 tk7 = rwc.a;
                    return !(tk7 instanceof mz) && !tk7.c.startsWith("content://");
                }
            case 5:
                return ct0.c((Uri) obj, ((rwc) this.b).a.c());
            default:
                return ((ioa) obj).Y == ((tf3) this.b).o();
        }
    }

    public String z(sn1 sn1) {
        switch (this.a) {
            case 22:
                n4e n4e = (n4e) this.b;
                n4e.o = sn1;
                return "SettableFuture hashCode: " + n4e.hashCode();
            case 23:
                ((q4e) this.b).z0 = sn1;
                return "SurfaceOutputImpl close future complete";
            default:
                ((jhe) this.b).k.set(sn1);
                return "textureViewImpl_waitForNextFrame";
        }
    }
}
