package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.LinearInterpolator;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.android.OneMeApplication;
import one.me.android.di.ConcurrentComponent;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.RLottie;
import one.me.sdk.media.ffmpeg.WebmConfig;
import one.me.sdk.uikit.qr.QrCodeGenerator;
import ru.ok.messages.analytics.DailyAnalyticsWorker;
import ru.ok.tamtam.android.notifications.messages.tracker.NotificationTrackerCleanupScheduler;

/* renamed from: my9  reason: default package */
public final /* synthetic */ class my9 implements s16 {
    public final /* synthetic */ int a;

    public /* synthetic */ my9(int i) {
        this.a = i;
    }

    /* JADX WARNING: type inference failed for: r0v116, types: [java.lang.Object, fyb] */
    public final Object invoke() {
        int i = 0;
        jue jue = jue.a;
        switch (this.a) {
            case 0:
                int i2 = OneMeApplication.w0;
                nqc nqc = nqc.a;
                dce dce = (dce) nqc.getAccessor().c(dce.class);
                if (dce.Z.get() == null) {
                    dce.i();
                }
                dce.f(true);
                dcc dcc = (dcc) o2a.a.getAccessor().c(dcc.class);
                grd grd = dcc.o;
                int i3 = zp4.o;
                ck5 ck5 = new ck5(new u09(vx3.M(grd, mt0.P(10, eq4.SECONDS)), 24), new ccc(dcc, (Continuation) null), 5);
                xs7.E(dcc.c, (hu3) null, ru3.a, new mk5(ck5, (Continuation) null), 1);
                ((f3d) nqc.getAccessor().c(f3d.class)).a(dcc);
                return jue;
            case 1:
                int i4 = OneMeApplication.w0;
                wud wud = (wud) o2a.a.getAccessor().c(wud.class);
                return jue;
            case 2:
                int i5 = OneMeApplication.w0;
                h0a h0a = (h0a) o2a.a.getAccessor().c(h0a.class);
                i03 i03 = h0a.b;
                String string = i03.g.getString("version.force.update.received", BuildConfig.FLAVOR);
                h0a.d.getClass();
                if (!hhd.f(string, "25.7.2")) {
                    i03.l("version.force.update.received", (String) null);
                }
                return jue;
            case 3:
                int i6 = OneMeApplication.w0;
                ((luf) o2a.a.getAccessor().c(luf.class)).a(new e0d());
                return jue;
            case 4:
                int i7 = OneMeApplication.w0;
                oo3 oo3 = (oo3) o2a.a.getAccessor().c(oo3.class);
                oo3.a.d(oo3);
                return jue;
            case 5:
                int i8 = OneMeApplication.w0;
                rp1 rp1 = (rp1) o2a.a.getAccessor().c(rp1.class);
                rp1.getClass();
                rp1.D0.b(new pp1(rp1, 3));
                return jue;
            case 6:
                int i9 = OneMeApplication.w0;
                o2a o2a = o2a.a;
                o2a.l().i = new mv4(19, o2a.b());
                return jue;
            case 7:
                int i10 = OneMeApplication.w0;
                nqc nqc2 = nqc.a;
                nqc2.g().b();
                nqc2.f().e();
                return jue;
            case 8:
                int i11 = OneMeApplication.w0;
                ((q0a) o2a.a.getAccessor().c(q0a.class)).getClass();
                return Boolean.FALSE;
            case 9:
                int i12 = OneMeApplication.w0;
                ConcurrentComponent.INSTANCE.getExecutors().b().execute(new eq6(25, new mv4(20, new r7e(new my9(15)))));
                return jue;
            case 10:
                int i13 = OneMeApplication.w0;
                ((xce) o2a.a.getAccessor().c(xce.class)).f();
                return jue;
            case 11:
                int i14 = OneMeApplication.w0;
                p7c p7c = DailyAnalyticsWorker.x0;
                yma yma = (yma) ((xma) ((xma) new xma(DailyAnalyticsWorker.class, 1, TimeUnit.DAYS).setConstraints(new if3(1, false, false, false, false, -1, -1, o23.w0(new LinkedHashSet())))).addTag("ru.ok.messages.analytics.DailyAnalyticsWorker")).build();
                UUID id = yma.getId();
                udd.p("ru.ok.messages.analytics.DailyAnalyticsWorker", "work " + id + " try to add ru.ok.messages.analytics.DailyAnalyticsWorker request", new Object[0]);
                mtf.e((mtf) nqc.a.getAccessor().c(mtf.class), "ru.ok.messages.analytics.DailyAnalyticsWorker", 2, yma, false, 24);
                return jue;
            case 12:
                int i15 = OneMeApplication.w0;
                vp9 vp9 = (vp9) nqc.a.getAccessor().c(vp9.class);
                vp9.getClass();
                udd.p("NotificationTrackerCleanupScheduler", "schedule task", new Object[0]);
                TimeUnit timeUnit = TimeUnit.DAYS;
                mtf.e(vp9.a, "NotificationTrackerCleanupScheduler", 2, (yma) ((xma) ((xma) new xma(NotificationTrackerCleanupScheduler.NotificationTrackerCleanupWorker.class, 7, timeUnit).setInitialDelay(7, timeUnit)).addTag("NotificationTrackerCleanupScheduler")).build(), true, 8);
                return jue;
            case 13:
                int i16 = OneMeApplication.w0;
                ((f87) o2a.a.getAccessor().c(f87.class)).a();
                return jue;
            case 14:
                int i17 = OneMeApplication.w0;
                if (QrCodeGenerator.b) {
                    QrCodeGenerator.a.getClass();
                    udd.p("QrCodeGenerator", "Native library (qrcode) was successfully loaded", new Object[0]);
                }
                return jue;
            case 15:
                int i18 = OneMeApplication.w0;
                return (gl7) o2a.a.getAccessor().c(gl7.class);
            case 16:
                int i19 = OneMeApplication.w0;
                o2a o2a2 = o2a.a;
                ez3.e = (eg9) o2a2.getAccessor().c(eg9.class);
                RLottie.init((RLottie.Config) o2a2.getAccessor().c(RLottie.Config.class));
                WebmConfig.init((WebmConfig.Config) o2a2.getAccessor().c(WebmConfig.Config.class));
                return jue;
            case 17:
                int i20 = OneMeApplication.w0;
                wv4 wv4 = (wv4) o2a.a.getAccessor().c(wv4.class);
                ou4 ou4 = (ou4) wv4.b.getValue();
                bv4 bv4 = (bv4) wv4.e.getValue();
                int length = ((Bitmap[]) bv4.a.a).length - 1;
                if (length >= 0) {
                    while (true) {
                        bv4.g.computeIfAbsent(Integer.valueOf(i), new di(9, new q8(i, 2, bv4)));
                        if (i != length) {
                            i++;
                        }
                    }
                }
                return jue;
            case 18:
                int i21 = OneMeApplication.w0;
                gj gjVar = (gj) o2a.a.getAccessor().c(gj.class);
                qod E = xs7.E(gjVar.j, (hu3) null, ru3.b, new ej(gjVar, (Continuation) null), 1);
                gjVar.k.o1(gjVar, gj.p[0], E);
                return jue;
            case 19:
                return new sz9(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 2, rz9.e, (Drawable) null, (Drawable) null);
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                return fye.c(phc.T1).toString();
            case 21:
                ha4 ha4 = oi4.a;
                return MainDispatcherLoader.dispatcher;
            case 22:
                return new v3a(999, rhc.s0, Integer.valueOf(phc.y0), "NARNIA");
            case 23:
                t97 O = ez3.O(3, new opd(16));
                t97 O2 = ez3.O(3, new opd(17));
                return new f7e((GradientDrawable) O2.getValue(), (GradientDrawable) O.getValue(), (GradientDrawable) O2.getValue(), (GradientDrawable) O.getValue());
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                t97 O3 = ez3.O(3, new opd(12));
                return new f7e((GradientDrawable) ez3.O(3, new opd(13)).getValue(), (GradientDrawable) O3.getValue(), (GradientDrawable) ez3.O(3, new opd(14)).getValue(), (GradientDrawable) ez3.O(3, new opd(15)).getValue());
            case 25:
                return new ida(a24.X(((float) 3) * dh4.c().getDisplayMetrics().density), dh4.c().getDisplayMetrics().density * 4.0f);
            case 26:
                return new yfe();
            case 27:
                return new LinearInterpolator();
            case 28:
                return new LinearInterpolator();
            default:
                ? obj = new Object();
                obj.a = new ThreadLocal();
                obj.b = new ThreadLocal();
                return obj;
        }
    }
}
