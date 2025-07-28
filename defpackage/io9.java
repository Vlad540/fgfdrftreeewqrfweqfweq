package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.text.NumberFormat;

/* renamed from: io9  reason: default package */
public abstract class io9 {
    public boolean a = false;
    public Object b;
    public Object c;
    public Object d;

    public io9(FrameLayout frameLayout, f3b f3b) {
        this.c = frameLayout;
        this.d = f3b;
    }

    public void a(Bundle bundle) {
        if (this.a) {
            bundle.putCharSequence("android.summaryText", (CharSequence) this.d);
        }
        CharSequence charSequence = (CharSequence) this.c;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String e = e();
        if (e != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", e);
        }
    }

    public abstract void b(b0d b0d);

    public RemoteViews c(int i) {
        boolean z;
        boolean z2;
        Resources resources = ((un9) this.b).a.getResources();
        RemoteViews remoteViews = new RemoteViews(((un9) this.b).a.getPackageName(), i);
        un9 un9 = (un9) this.b;
        int i2 = un9.k;
        int i3 = 0;
        if (un9.i != null) {
            remoteViews.setViewVisibility(wpb.icon, 0);
            remoteViews.setImageViewBitmap(wpb.icon, d(((un9) this.b).i, 0, 0));
        }
        CharSequence charSequence = ((un9) this.b).e;
        if (charSequence != null) {
            remoteViews.setTextViewText(wpb.title, charSequence);
        }
        CharSequence charSequence2 = ((un9) this.b).f;
        boolean z3 = true;
        if (charSequence2 != null) {
            remoteViews.setTextViewText(wpb.text, charSequence2);
            z = true;
        } else {
            z = false;
        }
        ((un9) this.b).getClass();
        if (((un9) this.b).j > 0) {
            if (((un9) this.b).j > resources.getInteger(irb.status_bar_notification_info_maxnum)) {
                remoteViews.setTextViewText(wpb.info, resources.getString(rtb.status_bar_notification_info_overflow));
            } else {
                remoteViews.setTextViewText(wpb.info, NumberFormat.getIntegerInstance().format((long) ((un9) this.b).j));
            }
            remoteViews.setViewVisibility(wpb.info, 0);
            z = true;
            z2 = true;
        } else {
            remoteViews.setViewVisibility(wpb.info, 8);
            z2 = false;
        }
        ((un9) this.b).getClass();
        un9 un92 = (un9) this.b;
        long j = 0;
        if ((un92.l ? un92.F.when : 0) == 0) {
            z3 = z2;
        } else if (un92.m) {
            remoteViews.setViewVisibility(wpb.chronometer, 0);
            int i4 = wpb.chronometer;
            un9 un93 = (un9) this.b;
            if (un93.l) {
                j = un93.F.when;
            }
            remoteViews.setLong(i4, "setBase", (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + j);
            remoteViews.setBoolean(wpb.chronometer, "setStarted", true);
            ((un9) this.b).getClass();
        } else {
            remoteViews.setViewVisibility(wpb.time, 0);
            int i5 = wpb.time;
            un9 un94 = (un9) this.b;
            if (un94.l) {
                j = un94.F.when;
            }
            remoteViews.setLong(i5, "setTime", j);
        }
        remoteViews.setViewVisibility(wpb.right_side, z3 ? 0 : 8);
        int i6 = wpb.line3;
        if (!z) {
            i3 = 8;
        }
        remoteViews.setViewVisibility(i6, i3);
        return remoteViews;
    }

    public Bitmap d(IconCompat iconCompat, int i, int i2) {
        Object obj;
        Resources resources;
        Context context = ((un9) this.b).a;
        if (iconCompat.a == 2 && (obj = iconCompat.b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if (!"0_resource_name_obfuscated".equals(str4)) {
                    String f = iconCompat.f();
                    if ("android".equals(f)) {
                        resources = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(f, 8192);
                            if (applicationInfo != null) {
                                resources = packageManager.getResourcesForApplication(applicationInfo);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        resources = null;
                    }
                    int identifier = resources.getIdentifier(str4, str3, str5);
                    if (iconCompat.e != identifier) {
                        iconCompat.e = identifier;
                    }
                }
            }
        }
        Drawable c2 = zn6.c(zn6.d(iconCompat, context), context);
        int intrinsicWidth = i2 == 0 ? c2.getIntrinsicWidth() : i2;
        if (i2 == 0) {
            i2 = c2.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i2, Bitmap.Config.ARGB_8888);
        c2.setBounds(0, 0, intrinsicWidth, i2);
        if (i != 0) {
            c2.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        c2.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public String e() {
        return null;
    }

    public abstract View f();

    public abstract Bitmap g();

    public RemoteViews h() {
        return null;
    }

    public RemoteViews i() {
        return null;
    }

    public abstract void j();

    public abstract void k();

    public abstract void l(y4e y4e, xz xzVar);

    public void m() {
        View f = f();
        if (f != null && this.a) {
            FrameLayout frameLayout = (FrameLayout) this.c;
            Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
            int layoutDirection = frameLayout.getLayoutDirection();
            f3b f3b = (f3b) this.d;
            f3b.getClass();
            if (size.getHeight() == 0 || size.getWidth() == 0) {
                size.toString();
            } else if (f3b.f()) {
                if (f instanceof TextureView) {
                    ((TextureView) f).setTransform(f3b.d());
                } else {
                    Display display = f.getDisplay();
                    if (!f3b.g || display == null || display.getRotation() == f3b.e) {
                    }
                    boolean z = f3b.g;
                    if (!z) {
                        if ((!z ? f3b.c : -z3d.O(f3b.e)) != 0) {
                        }
                    }
                }
                RectF e = f3b.e(size, layoutDirection);
                f.setPivotX(0.0f);
                f.setPivotY(0.0f);
                f.setScaleX(e.width() / ((float) f3b.a.getWidth()));
                f.setScaleY(e.height() / ((float) f3b.a.getHeight()));
                f.setTranslationX(e.left - ((float) f.getLeft()));
                f.setTranslationY(e.top - ((float) f.getTop()));
            }
        }
    }

    public void n(un9 un9) {
        if (((un9) this.b) != un9) {
            this.b = un9;
            if (un9 != null) {
                un9.q(this);
            }
        }
    }

    public abstract ch7 o();

    public io9() {
    }
}
