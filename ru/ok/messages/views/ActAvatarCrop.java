package ru.ok.messages.views;

import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.messages.views.widgets.AvatarCropView;

public class ActAvatarCrop extends r5 implements gc0 {
    public static final /* synthetic */ int h1 = 0;
    public AvatarCropView Y0;
    public ImageView Z0;
    public ImageView a1;
    public ImageView b1;
    public OneMeButton c1;
    public ImageView d1;
    public Point e1;
    public final Matrix f1 = new Matrix();
    public boolean g1 = false;

    public final String Z() {
        return "AVATAR_CROP";
    }

    public final void d0() {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, r5, im, gc0, java.lang.Object, android.app.Activity, ru.ok.messages.views.ActAvatarCrop] */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        s59 s59 = km4.y0;
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(1280);
            window.clearFlags(67108864);
            window.setStatusBarColor(getColor(jmb.transparent));
            window.setNavigationBarColor(s59.n(this).g().b().a.i);
        }
        setContentView(zrb.act_avatar_crop);
        Uri uri = (Uri) getIntent().getParcelableExtra("ru.ok.tamtam.extra.URI");
        findViewById(yqb.bottom_background).setBackgroundColor(s59.n(this).g().b().a.i);
        s59.n(this).g();
        ColorStateList valueOf = ColorStateList.valueOf(-1);
        ImageView imageView = (ImageView) findViewById(yqb.rotate);
        this.Z0 = imageView;
        imageView.setImageTintList(valueOf);
        this.Z0.setOnClickListener(new l5(this, 0));
        ImageView imageView2 = (ImageView) findViewById(yqb.flip_horizontally);
        this.a1 = imageView2;
        imageView2.setImageTintList(valueOf);
        this.a1.setOnClickListener(new l5(this, 1));
        ImageView imageView3 = (ImageView) findViewById(yqb.close);
        this.b1 = imageView3;
        imageView3.setImageTintList(valueOf);
        this.b1.setOnClickListener(new l5(this, 2));
        OneMeButton oneMeButton = (OneMeButton) findViewById(yqb.reset);
        this.c1 = oneMeButton;
        oneMeButton.setText(xub.f134oneme_avatar_rop_reset);
        this.c1.setSize(v0a.a);
        this.c1.setMode(u0a.o);
        this.c1.setAppearance(s0a.X);
        this.c1.setOnClickListener(new l5(this, 3));
        ImageView imageView4 = (ImageView) findViewById(yqb.done);
        this.d1 = imageView4;
        imageView4.setImageTintList(valueOf);
        this.d1.setOnClickListener(new l5(this, 4));
        this.Y0 = (AvatarCropView) findViewById(yqb.crop);
        if (getIntent().getBooleanExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false)) {
            this.Y0.setMode(1);
            setRequestedOrientation(1);
        } else {
            this.Y0.setMode(0);
        }
        this.Y0.setZoomEnabled(true);
        AvatarCropView avatarCropView = this.Y0;
        z66 z66 = new z66(getResources());
        z66.l = jlc.j;
        z66.b = 0;
        avatarCropView.setHierarchy(z66.a());
        ywa a = a06.a.a();
        a.c(uri);
        a.h = new o5(0, this);
        this.Y0.setController(a.a());
        this.Y0.setTransformChangeListener(this);
    }

    public final void onResume() {
        super.onResume();
        xg9 m = ((k93) this.O0.b).m();
        mnc mnc = mnc.AVATAR_PICKER_CROP;
        eja eja = eja.e;
        m.f(mnc, eja.e);
    }
}
