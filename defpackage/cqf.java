package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;
import one.me.sdk.media.ffmpeg.WebmFactory;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: cqf  reason: default package */
public final class cqf extends FrameLayout {
    public final lv1 a;
    public final bqf b;
    public boolean c;
    public boolean o;
    public qud w0;

    /* JADX WARNING: type inference failed for: r4v4, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public cqf(Context context) {
        super(context, (AttributeSet) null);
        lv1 lv1 = new lv1(context);
        this.a = lv1;
        bqf bqf = new bqf(context);
        bqf.setId(gaa.g);
        bqf.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.b = bqf;
        addView((OneMeDraweeView) lv1.b);
        addView(bqf);
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r7v5, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final void a(ktd ktd, int i) {
        boolean z;
        qud qud = this.w0;
        if (qud != null) {
            qud.b(ktd);
        }
        String str = ktd.Y;
        lv1 lv1 = this.a;
        boolean z2 = true;
        bqf bqf = this.b;
        if (str == null || str.length() == 0) {
            bqf.c();
            bqf.setVisibility(8);
            ((OneMeDraweeView) lv1.b).setVisibility(0);
        } else {
            bqf.setOnFirstFrameListener(new xle(17, (Object) this));
            bqf.setVisibility(0);
            this.c = true;
            if (str.length() == 0) {
                bqf.c();
            } else {
                String str2 = bqf.a;
                if (str2 == null || !str2.equals(str)) {
                    bqf.b = true;
                    bqf.a = str;
                    AnimatedFileDrawable create = WebmFactory.create(new WebmFactory.Config.Builder().setAutoStart(true).setAutoRepeat(true).setWay(((WebmFactory.Way.Url.Builder) new WebmFactory.Way.Url.Builder().setUrl(str).setSize(i, i)).setNetworkFetchEnabled(true).build()).build());
                    create.addOnNextFrameRenderedListener(bqf);
                    bqf.setImageDrawable(create);
                } else {
                    z = false;
                    this.c = false;
                    if (!z || this.o) {
                        z2 = false;
                    }
                    this.o = false;
                }
            }
            z = true;
            this.c = false;
            z2 = false;
            this.o = false;
        }
        if (z2) {
            ? r7 = (OneMeDraweeView) lv1.b;
            tr6 b2 = tr6.b(ktd.o);
            int i2 = OneMeDraweeView.F0;
            r7.o(b2, (tr6) null);
            r7.setVisibility(0);
        }
    }

    public final void b(er7 er7) {
        if (er7.a == null) {
            er7.a = Collections.newSetFromMap(new WeakHashMap());
        }
        Set set = er7.a;
        if (set != null) {
            set.add(this.b);
        }
    }

    public final qud getSizeConfigurator() {
        return this.w0;
    }

    public final void onMeasure(int i, int i2) {
        qud qud = this.w0;
        ms a2 = qud != null ? qud.a(i, i2) : null;
        if (a2 != null) {
            i = a2.b;
        }
        if (a2 != null) {
            i2 = a2.c;
        }
        super.onMeasure(i, i2);
    }

    public final void setSizeConfigurator(qud qud) {
        this.w0 = qud;
    }
}
