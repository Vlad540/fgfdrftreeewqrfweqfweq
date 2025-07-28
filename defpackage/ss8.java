package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.b;
import com.my.tracker.MyTrackerConfig;
import one.me.chats.picker.PickerChatsListWidget;
import one.me.chats.picker.PickerChatsTabWidget;
import one.me.chats.picker.chats.PickerChatsListWidget2;
import one.me.chats.picker.chats.PickerChatsTabWidget2;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.arch.Widget;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ss8  reason: default package */
public final /* synthetic */ class ss8 implements xz2, j26, iba, xw6, mr6, of3, uw9, r3e, MyTrackerConfig.Logger, bid, RTCStatsCollectorCallback, ps5, au, otc, yv0, tn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ss8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void J(jba jba) {
        jba jba2 = jba.X;
        a73 a73 = (z63) this.b;
        if (jba == jba2) {
            a73.makeCompleting$kotlinx_coroutines_core(Boolean.TRUE);
            return;
        }
        a73.makeCompleting$kotlinx_coroutines_core(Boolean.FALSE);
    }

    public nsf M(View view, nsf nsf) {
        switch (this.a) {
            case 8:
                ze9 ze9 = (ze9) this.b;
                ViewGroup viewGroup = ze9.Y;
                int b2 = nsf.b();
                if (viewGroup.getPaddingLeft() != b2) {
                    viewGroup.setPadding(b2, viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
                }
                ViewGroup viewGroup2 = ze9.Y;
                int c = nsf.c();
                if (viewGroup2.getPaddingRight() != c) {
                    viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop(), c, viewGroup2.getPaddingBottom());
                }
                return nsf;
            default:
                jf9 jf9 = (jf9) this.b;
                ViewGroup viewGroup3 = jf9.D0;
                int b3 = nsf.b();
                if (viewGroup3.getPaddingLeft() != b3) {
                    viewGroup3.setPadding(b3, viewGroup3.getPaddingTop(), viewGroup3.getPaddingRight(), viewGroup3.getPaddingBottom());
                }
                ViewGroup viewGroup4 = jf9.D0;
                int c2 = nsf.c();
                if (viewGroup4.getPaddingRight() != c2) {
                    viewGroup4.setPadding(viewGroup4.getPaddingLeft(), viewGroup4.getPaddingTop(), c2, viewGroup4.getPaddingBottom());
                }
                at7.e(jf9.D0, nsf.a());
                return nsf;
        }
    }

    public void a(long j, long j2, long j3) {
        ll4 ll4 = ((mgb) this.b).e;
        if (ll4 != null) {
            ll4.b((j == -1 || j == 0) ? -1.0f : (((float) j2) * 100.0f) / ((float) j), j, j2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [h10, java.lang.Object] */
    public void accept(Object obj) {
        Object obj2 = this.b;
        switch (this.a) {
            case 6:
                m00 m00 = (m00) obj;
                int ordinal = ((o10) obj2).a.ordinal();
                if (ordinal == 2) {
                    a10 a10 = m00.b;
                    if (a10 == null) {
                        a10 = a10.A0;
                    }
                    z00 b2 = a10.b();
                    b2.g = null;
                    m00.b = new a10(b2);
                    return;
                } else if (ordinal == 3) {
                    k10 a2 = m00.c().a();
                    a2.a = 0;
                    a2.l = null;
                    m00.d = new n10(a2);
                    return;
                } else if (ordinal == 5) {
                    i10 i10 = m00.f;
                    if (i10 == null) {
                        i10 = i10.p;
                    }
                    ? obj3 = new Object();
                    long j = i10.a;
                    obj3.d = i10.b;
                    obj3.b = i10.c;
                    obj3.c = i10.d;
                    obj3.f = i10.e;
                    obj3.g = i10.f;
                    obj3.i = i10.g;
                    obj3.h = i10.h;
                    obj3.e = i10.i;
                    obj3.j = i10.j;
                    obj3.k = i10.k;
                    obj3.l = i10.l;
                    obj3.m = i10.m;
                    obj3.n = i10.n;
                    obj3.o = i10.o;
                    obj3.a = 0;
                    m00.f = obj3.a();
                    return;
                } else if (ordinal == 9) {
                    u00 a3 = m00.b().a();
                    a3.a = 0;
                    a3.d = null;
                    m00.r = new v00(a3);
                    return;
                } else {
                    return;
                }
            case 7:
                ((al7) ((q98) obj2)).p(((Long) obj).longValue());
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                ((i6g) obj2).o = (sd0) obj;
                return;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                ((bd4) obj2).getClass();
                udd.s("bd4", "onError", (Throwable) obj);
                return;
            default:
                yia yia = (yia) obj;
                RangeSeekBarView rangeSeekBarView = (RangeSeekBarView) obj2;
                rangeSeekBarView.K0.append(((Long) yia.a).longValue(), (Bitmap) yia.b);
                rangeSeekBarView.invalidate();
                return;
        }
    }

    public ch7 apply(Object obj) {
        Void voidR = (Void) obj;
        return ((e3b) this.b).d.o();
    }

    public void b(x87 x87) {
        st1 st1;
        k3b k3b = (k3b) this.b;
        k3b.getClass();
        if ((x87 instanceof wvf) && (st1 = k3b.z0) != null) {
            wvf wvf = (wvf) x87;
            if (st1.h() && st1.s) {
                gt0.i();
                yvf yvf = (yvf) st1.u.d();
                if (yvf != null) {
                    float c = yvf.c();
                    float f = wvf.d;
                    st1.o(Math.min(Math.max(c * (f > 1.0f ? us8.g(f, 1.0f, 2.0f, 1.0f) : 1.0f - ((1.0f - f) * 2.0f)), yvf.b()), yvf.a()));
                }
            }
        }
    }

    public boolean e(ClickableSpan clickableSpan, int i, int i2, String str, sf7 sf7, MotionEvent motionEvent) {
        xz2 xz2 = ((ts8) this.b).o;
        if (xz2 != null) {
            return xz2.e(clickableSpan, i, i2, str, sf7, motionEvent);
        }
        return false;
    }

    public void f(nr6 nr6) {
        d39 d39 = (d39) this.b;
        synchronized (d39.a) {
            d39.c++;
        }
        d39.e(nr6);
    }

    public Object get() {
        ef9 ef9 = (ef9) this.b;
        ef9.getClass();
        StringBuilder sb = new StringBuilder("    ");
        int i = cic.y2;
        Context context = (Context) ef9.b;
        sb.append(context.getString(i));
        SpannableString spannableString = new SpannableString(sb.toString());
        Drawable b2 = gq3.b(context, zhc.B);
        if (b2 != null) {
            b2.setBounds(0, 0, b2.getIntrinsicWidth(), b2.getIntrinsicHeight());
            b2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            spannableString.setSpan(new ImageSpan(b2), 0, 3, 17);
        }
        return spannableString;
    }

    public int i(int i) {
        int l = ((q8b) ((pg7) ((ProfileChangeLinkScreen) this.b).Y.C(i))).l();
        if ((536870911 & l) == 2048) {
            return 0;
        }
        if (jjd.t(l)) {
            return 1;
        }
        if (jjd.v(l)) {
            return 2;
        }
        return jjd.u(l) ? 3 : 4;
    }

    public void j(ihd ihd) {
        ((cia) this.b).d.invoke(new aia(ihd));
    }

    public void log(int i, String str, Throwable th) {
        Object obj;
        if (i >= ((int) ((vqc) this.b).o(PmsKey.f83mytrackerloglevel, (long) 4))) {
            tn7.c.getClass();
            u1 it = tn7.z0.iterator();
            while (true) {
                u1 u1Var = it;
                if (!u1Var.hasNext()) {
                    obj = null;
                    break;
                }
                obj = u1Var.next();
                if (((tn7) obj).a == i) {
                    break;
                }
            }
            tn7 tn7 = (tn7) obj;
            if (tn7 == null) {
                tn7 = tn7.o;
            }
            udd.K(tn7, "OneMeMyTracker", str, new Object[]{th});
        }
    }

    public void onStatsDelivered(RTCStatsReport rTCStatsReport) {
        ((zrd) this.b).a(new yrd(rTCStatsReport));
    }

    public Widget t(String str, b bVar) {
        Object obj = this.b;
        switch (this.a) {
            case LangUtils.HASH_SEED:
                k77[] k77Arr = PickerChatsTabWidget.z0;
                PickerChatsTabWidget pickerChatsTabWidget = (PickerChatsTabWidget) obj;
                pickerChatsTabWidget.getClass();
                k77 k77 = PickerChatsTabWidget.z0[0];
                PickerChatsListWidget pickerChatsListWidget = new PickerChatsListWidget(str, ((inc) pickerChatsTabWidget.a.a(pickerChatsTabWidget)).a, (x54) null);
                pickerChatsListWidget.Z = bVar;
                if (pickerChatsListWidget.isAttached()) {
                    pickerChatsListWidget.n0().setRecycledViewPool(bVar);
                }
                return pickerChatsListWidget;
            default:
                k77[] k77Arr2 = PickerChatsTabWidget2.C0;
                PickerChatsTabWidget2 pickerChatsTabWidget2 = (PickerChatsTabWidget2) obj;
                pickerChatsTabWidget2.getClass();
                k77[] k77Arr3 = PickerChatsTabWidget2.C0;
                k77 k772 = k77Arr3[0];
                String str2 = ((inc) pickerChatsTabWidget2.a.a(pickerChatsTabWidget2)).a;
                k77 k773 = k77Arr3[1];
                boolean booleanValue = ((Boolean) pickerChatsTabWidget2.b.a(pickerChatsTabWidget2)).booleanValue();
                k77 k774 = k77Arr3[2];
                PickerChatsListWidget2 pickerChatsListWidget2 = new PickerChatsListWidget2(str, str2, (q72) pickerChatsTabWidget2.c.a(pickerChatsTabWidget2), false, booleanValue, pickerChatsTabWidget2.X, 8, (x54) null);
                pickerChatsListWidget2.y0 = bVar;
                if (pickerChatsListWidget2.isAttached()) {
                    pickerChatsListWidget2.o0().setRecycledViewPool(bVar);
                }
                return pickerChatsListWidget2;
        }
    }

    public String z(sn1 sn1) {
        xq1 xq1 = (xq1) this.b;
        xq1.c = sn1;
        return "RequestCompleteListener[" + xq1 + "]";
    }

    public /* synthetic */ ss8(ur3 ur3, x7c x7c) {
        this.a = 27;
        this.b = ur3;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [at8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, l10] */
    /* JADX WARNING: type inference failed for: r3v2, types: [ir1, java.lang.Object] */
    /* renamed from: apply  reason: collision with other method in class */
    public Object m81apply(Object obj) {
        ir1 ir1;
        switch (this.a) {
            case 1:
                et8 et8 = (et8) obj;
                ? obj2 = new Object();
                ys8 ys8 = (ys8) this.b;
                dr8 dr8 = ys8.a;
                l10 l10 = null;
                if (dr8 == null) {
                    ir1 = null;
                } else {
                    ? obj3 = new Object();
                    obj3.b = dr8.b;
                    obj3.a = dr8.a;
                    obj3.c = dr8.c;
                    ir1 = obj3;
                }
                obj2.a = ir1;
                obj2.c = ys8.c;
                obj2.b = ys8.b;
                obj2.d = ys8.d;
                f3f f3f = ys8.e;
                if (f3f != null) {
                    ? obj4 = new Object();
                    obj4.c = f3f.c;
                    obj4.b = f3f.b;
                    obj4.a = f3f.a;
                    obj4.d = f3f.d;
                    l10 = obj4;
                }
                obj2.e = l10;
                et8.getClass();
                return new y63(2, new uh(et8, 12, obj2));
            case 2:
                et8 et82 = (et8) obj;
                dr8 dr82 = (dr8) this.b;
                long j = dr82.a;
                et82.getClass();
                return new y63(2, new ct8(et82, j, dr82.b, dr82.c));
            case Protos.Attaches.Attach.LOCATION:
                return new sd0(new BitmapDrawable((Resources) this.b, (Bitmap) obj));
            case 26:
                b2c b2c = (b2c) obj;
                b2c.getClass();
                return new y63(2, new uh(b2c, 20, (c2c) this.b));
            default:
                return (ax7) this.b;
        }
    }
}
