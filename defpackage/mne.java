package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import ru.ok.android.externcalls.BuildConfig;

/* renamed from: mne  reason: default package */
public final class mne extends b97 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mne(Context context, int i) {
        super(0);
        this.a = i;
        this.b = context;
    }

    public final Object invoke() {
        String str;
        switch (this.a) {
            case 0:
                String B = xs7.B();
                Context context = this.b;
                if (B.equals(context.getPackageName())) {
                    str = "tracer";
                } else {
                    str = "tracer-" + Uri.encode(B.replace(':', '-'));
                }
                File file = new File(context.getCacheDir(), str);
                h2g.t(file);
                return ng5.N(file, "settings.data");
            default:
                Context applicationContext = this.b.getApplicationContext();
                xne xne = new xne();
                xne.b = new wgd("xrRYkU895jUPp2YZo1sxmtFadnlX1oHyouadIxpNzAp");
                zne zne = new zne(applicationContext, BuildConfig.LIBRARY_PACKAGE_NAME, new f2b(xne));
                zne.b("calls-sdk-version", "125.1.0.48.1");
                return zne;
        }
    }
}
