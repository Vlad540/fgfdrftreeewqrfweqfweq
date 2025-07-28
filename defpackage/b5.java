package defpackage;

import android.accounts.AccountManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.InsetDrawable;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.tamtam.nano.Protos;

/* renamed from: b5  reason: default package */
public final /* synthetic */ class b5 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ b5(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return AccountManager.get(this.b);
            case 1:
                return gq3.b(this.b, phc.p0);
            case 2:
                return new InsetDrawable(gq3.b(this.b, phc.L0), a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
            case 3:
                return new InsetDrawable(gq3.b(this.b, phc.H0), a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
            case 4:
                return (AudioManager) this.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            case 5:
                return new gce(this.b);
            case 6:
                w39 w39 = new w39(this.b);
                float f = (float) 28;
                w39.setBounds(0, 0, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                return w39;
            case 7:
                return udd.C(this.b);
            case 8:
                return udd.C(this.b);
            case 9:
                sm1 sm1 = new sm1(this.b, (AttributeSet) null);
                sm1.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                sm1.setMode(qm1.c);
                sm1.setVideoLayoutUpdatesControllerProvider(new a01(23));
                return sm1;
            case 10:
                return udd.C(this.b);
            case 11:
                Space space = new Space(this.b);
                space.setId(View.generateViewId());
                space.setLayoutParams(new re3(-1, 0));
                return space;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                Space space2 = new Space(this.b);
                space2.setId(View.generateViewId());
                space2.setLayoutParams(new re3(-1, 0));
                return space2;
            case 13:
                dgc dgc = new dgc(this.b, (AttributeSet) null);
                dgc.setId(o1a.y1);
                dgc.setMode(yfc.b);
                float f2 = (float) 60;
                dgc.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density)));
                dgc.setLayoutParams(new re3(-2, -2));
                dgc.setButtonPadding(a24.X(((float) 5) * dh4.c().getDisplayMetrics().density));
                dgc.setVisibility(8);
                return dgc;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                dgc dgc2 = new dgc(this.b, (AttributeSet) null);
                dgc2.setId(o1a.x1);
                dgc2.setMode(yfc.a);
                float f3 = (float) 60;
                dgc2.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density)));
                dgc2.setLayoutParams(new re3(-2, -2));
                dgc2.setButtonPadding(a24.X(((float) 5) * dh4.c().getDisplayMetrics().density));
                dgc2.setVisibility(8);
                return dgc2;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return udd.C(this.b);
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                hxb hxb = new hxb(this.b);
                float f4 = (float) 60;
                hxb.setBounds(0, 0, a24.X(dh4.c().getDisplayMetrics().density * f4), a24.X(f4 * dh4.c().getDisplayMetrics().density));
                return hxb;
            case LangUtils.HASH_SEED /*17*/:
                TextView textView = new TextView(this.b);
                textView.setId(o1a.u1);
                textView.setGravity(17);
                nte.w.b(textView, yq4.b);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextColor(-855638017);
                textView.setVisibility(8);
                textView.setLayoutParams(new re3(-1, -2));
                return textView;
            case 18:
                jdd jdd = new jdd(this.b);
                idd idd = jdd.b;
                idd.c(false);
                jdd.onThemeChanged(qda.a);
                jdd.o = a24.X(((float) 30) * dh4.c().getDisplayMetrics().density);
                gdd gdd = gdd.b;
                hdd hdd = idd.y0;
                k77[] k77Arr = idd.E0;
                hdd.o1(idd, k77Arr[2], gdd);
                idd.getClass();
                idd.z0.o1(idd, k77Arr[3], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                return jdd;
            case 19:
                TextView textView2 = new TextView(this.b);
                textView2.setId(o1a.v1);
                textView2.setGravity(17);
                textView2.setMaxLines(2);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                nte.m.b(textView2, yq4.b);
                textView2.setTextColor(-1107296257);
                textView2.setVisibility(8);
                textView2.setLayoutParams(new re3(-1, -2));
                return textView2;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                zj1 zj1 = new zj1(this.b, (AttributeSet) null);
                zj1.setId(o1a.A1);
                zj1.setLayoutParams(new re3(-1, -2));
                zj1.setVisibility(8);
                return zj1;
            case 21:
                return gq3.b(this.b, n1a.c0);
            case 22:
                return gq3.b(this.b, n1a.j0);
            case 23:
                return gq3.b(this.b, n1a.Z);
            case 24:
                f11 f11 = new f11(this.b);
                f11.setLayoutParams(new re3(-1, -1));
                f11.setVisibility(8);
                return f11;
            case 25:
                jdd jdd2 = new jdd(this.b);
                idd idd2 = jdd2.b;
                idd2.c(false);
                jdd2.onThemeChanged(qda.a);
                gdd gdd2 = gdd.b;
                hdd hdd2 = idd2.y0;
                k77[] k77Arr2 = idd.E0;
                hdd2.o1(idd2, k77Arr2[2], gdd2);
                idd2.getClass();
                idd2.z0.o1(idd2, k77Arr2[3], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                jdd2.o = -a24.X(((float) 70) * dh4.c().getDisplayMetrics().density);
                return jdd2;
            case 26:
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.b, (AttributeSet) null);
                float f5 = (float) 32;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f5), a24.X(f5 * dh4.c().getDisplayMetrics().density));
                layoutParams.gravity = 8388629;
                appCompatImageView.setLayoutParams(layoutParams);
                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                urd.B(new ex1(3, (Continuation) null, 0), appCompatImageView);
                int X = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
                appCompatImageView.setPadding(X, X, X, X);
                return appCompatImageView;
            case 27:
                Context context = this.b;
                return new zd5(context, new yd5(context));
            case 28:
                TextView textView3 = new TextView(this.b);
                nte.o.b(textView3, yq4.b);
                textView3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                float f6 = (float) 12;
                textView3.setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f6), a24.X(((float) 4) * dh4.c().getDisplayMetrics().density), a24.X(f6 * dh4.c().getDisplayMetrics().density), textView3.getPaddingBottom());
                textView3.setTextColor(km4.y0.r(textView3).getText().b);
                return textView3;
            default:
                SharedPreferences sharedPreferences = this.b.getSharedPreferences("one.me.sdk.design.theme", 0);
                sharedPreferences.getAll();
                return sharedPreferences;
        }
    }

    public /* synthetic */ b5(Context context, cf1 cf1) {
        this.a = 9;
        this.b = context;
    }
}
