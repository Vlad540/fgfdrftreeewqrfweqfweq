package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.coroutines.Continuation;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: t2a  reason: default package */
public final /* synthetic */ class t2a implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ t2a(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [cv3, android.view.View, java.lang.Object] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new ContextThemeWrapper(this.b, kvb.Theme_MaterialComponents);
            case 1:
                ImageView imageView = new ImageView(this.b);
                imageView.setId(qhc.Y);
                float f = (float) 28;
                re3 re3 = new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                int i = qhc.Z;
                re3.i = i;
                re3.v = i;
                re3.l = i;
                re3.t = i;
                imageView.setLayoutParams(re3);
                urd.B(new ac2(3, (Continuation) null, 3), imageView);
                return imageView;
            case 2:
                return new EnhancedVectorDrawable(this.b, l9a.m);
            case 3:
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.b, (AttributeSet) null);
                appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return appCompatImageView;
            case 4:
                ? cv3 = new cv3(this.b, (AttributeSet) null);
                cv3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return cv3;
            case 5:
                OneMeButton oneMeButton = new OneMeButton(this.b, (AttributeSet) null);
                oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                oneMeButton.setSize(v0a.a);
                oneMeButton.setAppearance(s0a.X);
                return oneMeButton;
            case 6:
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.b, (AttributeSet) null);
                appCompatTextView.setLayoutParams(new re3(a24.X(((float) 0) * dh4.c().getDisplayMetrics().density), -2));
                nte.m.b(appCompatTextView, yq4.b);
                km4.y0.r(appCompatTextView);
                appCompatTextView.setTextColor(-1);
                appCompatTextView.setMaxLines(2);
                return appCompatTextView;
            case 7:
                TextView textView = new TextView(this.b);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                nte.m.b(textView, yq4.b);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setSingleLine();
                textView.setTextColor(-855638017);
                return textView;
            case 8:
                TextView textView2 = new TextView(this.b);
                textView2.setId(qhc.A0);
                nte.i.b(textView2, yq4.b);
                textView2.setLetterSpacing(0.0f);
                textView2.setSingleLine(true);
                fja.d(textView2);
                return textView2;
            case 9:
                ImageView imageView2 = new ImageView(this.b);
                imageView2.setId(qhc.y0);
                return imageView2;
            case 10:
                t3a t3a = new t3a(this.b);
                t3a.setId(qhc.z0);
                return t3a;
            case 11:
                PopupWindow popupWindow = new PopupWindow(this.b);
                popupWindow.setBackgroundDrawable((Drawable) null);
                popupWindow.setElevation(dh4.c().getDisplayMetrics().density * 12.0f);
                popupWindow.setFocusable(true);
                return popupWindow;
            case Protos.Attaches.Attach.PRESENT:
                Context context = this.b;
                MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, "pip-media-session", new ComponentName(context, fwa.class), (PendingIntent) null);
                mediaSessionCompat.setMetadata(new MediaMetadataCompat.Builder().putLong("android.media.metadata.DURATION", -1).build());
                return mediaSessionCompat;
            case 13:
                return gq3.b(this.b, zhc.N);
            case Protos.Attaches.Attach.LOCATION:
                return gq3.b(this.b, zhc.M);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return gq3.b(this.b, zhc.O);
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                t3a t3a2 = new t3a(this.b);
                t3a2.setAppearance(o3a.b);
                return t3a2;
            case LangUtils.HASH_SEED:
                ImageView imageView3 = new ImageView(this.b);
                float f2 = (float) 40;
                imageView3.setLayoutParams(new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density)));
                km4.y0.r(imageView3);
                imageView3.setImageTintList(ColorStateList.valueOf(-16745729));
                me4.o((float) 8, dh4.c().getDisplayMetrics().density, imageView3);
                return imageView3;
            case 18:
                ImageView imageView4 = new ImageView(this.b);
                float f3 = (float) 36;
                imageView4.setLayoutParams(new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density)));
                imageView4.setImageTintList(ColorStateList.valueOf(km4.y0.r(imageView4).getIcon().h));
                me4.o((float) 10, dh4.c().getDisplayMetrics().density, imageView4);
                return imageView4;
            case 19:
                TextView textView3 = new TextView(this.b);
                textView3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                textView3.setTextSize(32.0f);
                textView3.setTextAlignment(4);
                textView3.setGravity(17);
                textView3.setMaxLines(1);
                return textView3;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return new ContextThemeWrapper(this.b, kvb.Theme_MaterialComponents);
            case 21:
                ViewStub viewStub = new ViewStub(this.b);
                viewStub.setId(o1a.B0);
                viewStub.setVisibility(8);
                return viewStub;
            case 22:
                ViewStub viewStub2 = new ViewStub(this.b);
                viewStub2.setId(o1a.D0);
                return viewStub2;
            case 23:
                ImageView imageView5 = new ImageView(this.b);
                imageView5.setId(o1a.C0);
                return imageView5;
            case 24:
                TextView textView4 = new TextView(this.b);
                textView4.setId(o1a.B0);
                textView4.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                textView4.setTextColor(-1);
                nte.a.b(textView4, yq4.b);
                float f4 = (float) 0;
                textView4.setPadding(a24.X(((float) 2) * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f4), a24.X(dh4.c().getDisplayMetrics().density * f4), a24.X(f4 * dh4.c().getDisplayMetrics().density));
                textView4.setVisibility(8);
                textView4.setGravity(17);
                return textView4;
            case 25:
                TextView textView5 = new TextView(this.b);
                textView5.setId(o1a.D0);
                textView5.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                textView5.setTextColor(-855638017);
                nte.o.b(textView5, yq4.b);
                textView5.setVisibility(8);
                textView5.setGravity(17);
                return textView5;
            case 26:
                return pfa.x(this.b);
            case 27:
                return this.b.getResources().getStringArray(mlb.oneme_prefs_saved_messages_aliases);
            case 28:
                mz9 mz9 = new mz9(this.b);
                mz9.setId(caa.a);
                float f5 = (float) 24;
                mz9.setLayoutParams(new re3(a24.X(dh4.c().getDisplayMetrics().density * f5), a24.X(f5 * dh4.c().getDisplayMetrics().density)));
                mz9.setAvatarShape(fz9.a);
                return mz9;
            default:
                return new qo0(this.b);
        }
    }
}
