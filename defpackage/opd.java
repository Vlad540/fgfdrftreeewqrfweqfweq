package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Looper;
import android.os.strictmode.CustomViolation;
import android.os.strictmode.DiskReadViolation;
import android.os.strictmode.UntaggedSocketViolation;
import android.text.BoringLayout;
import android.view.VelocityTracker;
import java.lang.annotation.Annotation;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import one.me.startconversation.StartConversationScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: opd  reason: default package */
public final /* synthetic */ class opd implements s16 {
    public final /* synthetic */ int a;

    public /* synthetic */ opd(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<pae> cls = pae.class;
        Class<Context> cls2 = Context.class;
        jue jue = jue.a;
        boolean z = false;
        switch (this.a) {
            case 0:
                k77[] k77Arr = StartConversationScreen.L0;
                ipd ipd = ipd.a;
                return new dqd(ipd.getAccessor().d(cls), ipd.getAccessor().d(cls2), ipd.getAccessor().d(gsc.class), (ok3) ipd.getAccessor().c(ok3.class), ipd.getAccessor().d(vs7.class), ipd.getAccessor().d(bv2.class), ipd.getAccessor().d(ap3.class), ipd.b());
            case 1:
                k77[] k77Arr2 = StartConversationScreen.L0;
                return new xf0(zf0.a.getAccessor().d(kp3.class), true, (ll3) null, 46);
            case 2:
                return eja.e;
            case 3:
                return new bhd(false);
            case 4:
                return new bhd(true);
            case 5:
                k77[] k77Arr3 = StickersSettingsScreen.Y;
                return mnc.SETTINGS_STICKERS;
            case 6:
                k77[] k77Arr4 = StickersSettingsScreen.Y;
                uwd uwd = uwd.a;
                r7e d = uwd.getAccessor().d(zsd.class);
                uwd.getAccessor().d(v2c.class);
                return new gxd((Context) uwd.getAccessor().c(cls2), (pae) uwd.getAccessor().c(cls), d, uwd.getAccessor().d(fa5.class), uwd.getAccessor().d(l95.class));
            case 7:
                return new gk9();
            case 8:
                ht7 ht7 = new ht7();
                u1c u1c = new u1c(12);
                ijd ijd = new ijd();
                u1c.invoke(ijd);
                ht7.put(DiskReadViolation.class, new uzd(ijd.a));
                u1c u1c2 = new u1c(13);
                ijd ijd2 = new ijd();
                u1c2.invoke(ijd2);
                ht7.put(UntaggedSocketViolation.class, new uzd(ijd2.a));
                ArrayList arrayList = new ArrayList();
                arrayList.add(Collections.singletonList("com.google.android.gms"));
                ht7.put(CustomViolation.class, new uzd(arrayList));
                return ht7.b();
            case 9:
                c2e[] values = c2e.values();
                String[] strArr = {"updated", "removed", "cleared", "opened", "authorized"};
                Annotation[][] annotationArr = {null, null, null, null, null};
                nz4 nz4 = new nz4(values.length);
                int length = values.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    c2e c2e = values[i];
                    int i3 = i2 + 1;
                    String str = (String) cs.Z(i2, strArr);
                    if (str == null) {
                        str = c2e.name();
                    }
                    nz4.k(str, false);
                    Annotation[] annotationArr2 = (Annotation[]) cs.Z(i2, annotationArr);
                    if (annotationArr2 != null) {
                        for (Annotation annotation : annotationArr2) {
                            int i4 = nz4.d;
                            List[] listArr = nz4.f;
                            List list = listArr[i4];
                            if (list == null) {
                                list = new ArrayList(1);
                                listArr[nz4.d] = list;
                            }
                            list.add(annotation);
                        }
                    }
                    i++;
                    i2 = i3;
                }
                return new qz4(values, nz4);
            case 10:
                return VelocityTracker.obtain();
            case 11:
                int i5 = b7e.w0;
                return jue;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dh4.c().getDisplayMetrics().density * 20.0f);
                gradientDrawable.setSize(a24.X(((float) 51) * dh4.c().getDisplayMetrics().density), a24.X(((float) 31) * dh4.c().getDisplayMetrics().density));
                return gradientDrawable;
            case 13:
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dh4.c().getDisplayMetrics().density * 20.0f);
                gradientDrawable2.setSize(a24.X(((float) 51) * dh4.c().getDisplayMetrics().density), a24.X(((float) 31) * dh4.c().getDisplayMetrics().density));
                return gradientDrawable2;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setCornerRadius(dh4.c().getDisplayMetrics().density * 20.0f);
                gradientDrawable3.setSize(a24.X(((float) 51) * dh4.c().getDisplayMetrics().density), a24.X(((float) 31) * dh4.c().getDisplayMetrics().density));
                return gradientDrawable3;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setCornerRadius(dh4.c().getDisplayMetrics().density * 20.0f);
                gradientDrawable4.setSize(a24.X(((float) 51) * dh4.c().getDisplayMetrics().density), a24.X(((float) 31) * dh4.c().getDisplayMetrics().density));
                return gradientDrawable4;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                GradientDrawable gradientDrawable5 = new GradientDrawable();
                gradientDrawable5.setShape(1);
                float f = (float) 20;
                gradientDrawable5.setSize(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                return gradientDrawable5;
            case LangUtils.HASH_SEED /*17*/:
                GradientDrawable gradientDrawable6 = new GradientDrawable();
                gradientDrawable6.setShape(1);
                float f2 = (float) 24;
                gradientDrawable6.setSize(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
                return gradientDrawable6;
            case 18:
                return new hb5();
            case 19:
                wce[] wceArr = {x04.e0, db4.e0, ck9.e0, pb6.e0, wf8.e0};
                HashSet hashSet = new HashSet(ju7.S(5));
                cs.e0(wceArr, hashSet);
                return hashSet;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                return Looper.getMainLooper();
            case 21:
                k77[] k77Arr5 = ThreadsStateViewerScreen.X;
                return new mie((x4a) nie.a.getAccessor().c(x4a.class));
            case 22:
                return AsynchronousSocketChannel.open();
            case 23:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                return paint;
            case 24:
                Paint paint2 = new Paint();
                paint2.setAntiAlias(true);
                paint2.setFilterBitmap(true);
                return paint2;
            case 25:
                try {
                    Class<?> cls3 = Class.forName("android.os.SystemProperties");
                    z = r1g.q((String) cls3.getMethod("get", new Class[]{String.class}).invoke(cls3, new Object[]{"ro.miui.ui.version.code"}));
                } catch (Throwable unused) {
                }
                return Boolean.valueOf(z);
            case 26:
                Paint paint3 = new Paint();
                paint3.setAntiAlias(true);
                paint3.setDither(true);
                return paint3;
            case 27:
                BoringLayout.Metrics metrics = new BoringLayout.Metrics();
                c2f.I0.getFontMetricsInt(metrics);
                return metrics;
            case 28:
                k77[] k77Arr6 = a6f.O0;
                return jue;
            default:
                k77[] k77Arr7 = VideoMessageWidget.y0;
                int X = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
                GradientDrawable gradientDrawable7 = new GradientDrawable();
                gradientDrawable7.setShape(1);
                gradientDrawable7.setSize(X, X);
                return new InsetDrawable(gradientDrawable7, X);
        }
    }
}
