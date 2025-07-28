package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* renamed from: un9  reason: default package */
public final class un9 {
    public int A = 0;
    public String B;
    public int C = 0;
    public int D = 0;
    public final boolean E;
    public final Notification F;
    public final ArrayList G;
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public PendingIntent h;
    public IconCompat i;
    public int j;
    public int k;
    public boolean l = true;
    public boolean m;
    public io9 n;
    public int o;
    public int p;
    public boolean q;
    public String r;
    public boolean s;
    public String t;
    public boolean u = false;
    public String v;
    public Bundle w;
    public int x = 0;
    public int y = 0;
    public String z;

    public un9(Context context, String str) {
        Notification notification = new Notification();
        this.F = notification;
        this.a = context;
        this.z = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.k = 0;
        this.G = new ArrayList();
        this.E = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(gn9 gn9) {
        this.b.add(gn9);
    }

    public final Notification b() {
        Bundle bundle;
        RemoteViews h2;
        b0d b0d = new b0d(this);
        un9 un9 = (un9) b0d.o;
        io9 io9 = un9.n;
        if (io9 != null) {
            io9.b(b0d);
        }
        RemoteViews i2 = io9 != null ? io9.i() : null;
        Notification build = ((Notification.Builder) b0d.c).build();
        if (i2 != null) {
            build.contentView = i2;
        }
        if (!(io9 == null || (h2 = io9.h()) == null)) {
            build.bigContentView = h2;
        }
        if (io9 != null) {
            un9.n.getClass();
        }
        if (!(io9 == null || (bundle = build.extras) == null)) {
            io9.a(bundle);
        }
        return build;
    }

    public final void d(PendingIntent pendingIntent) {
        this.g = pendingIntent;
    }

    public final void e(CharSequence charSequence) {
        this.f = c(charSequence);
    }

    public final void f(CharSequence charSequence) {
        this.e = c(charSequence);
    }

    public final void g(int i2) {
        Notification notification = this.F;
        notification.defaults = i2;
        if ((i2 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void h(PendingIntent pendingIntent) {
        this.F.deleteIntent = pendingIntent;
    }

    public final void i(int i2, boolean z2) {
        Notification notification = this.F;
        if (z2) {
            notification.flags = i2 | notification.flags;
            return;
        }
        notification.flags = (~i2) & notification.flags;
    }

    public final void j() {
        this.r = "media3_group_key";
    }

    public final void k(Bitmap bitmap) {
        this.i = bitmap == null ? null : IconCompat.b(bitmap);
    }

    public final void l() {
        i(2, false);
    }

    public final void m() {
        i(8, true);
    }

    public final void n(boolean z2) {
        this.l = z2;
    }

    public final void o(int i2) {
        this.F.icon = i2;
    }

    public final void p(Uri uri) {
        Notification notification = this.F;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = tn9.a(tn9.e(tn9.c(tn9.b(), 4), 5));
    }

    public final void q(io9 io9) {
        if (this.n != io9) {
            this.n = io9;
            if (io9 != null) {
                io9.n(this);
            }
        }
    }

    public final void r(boolean z2) {
        this.m = z2;
    }

    public final void s() {
        this.y = 1;
    }

    public final void t(long j2) {
        this.F.when = j2;
    }
}
