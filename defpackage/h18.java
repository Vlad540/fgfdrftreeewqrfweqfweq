package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;

/* renamed from: h18  reason: default package */
public final class h18 {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final f18 d = new f18(this);
    public final yr e = new kgd(0);
    public qe4 f;
    public Messenger g;
    public uc8 h;

    /* JADX WARNING: type inference failed for: r0v1, types: [kgd, yr] */
    public h18(Context context, ComponentName componentName, jj7 jj7) {
        this.a = context;
        Bundle bundle = new Bundle();
        this.c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        jj7.b = this;
        g18 g18 = (g18) jj7.a;
        g18.getClass();
        this.b = new MediaBrowser(context, componentName, g18, bundle);
    }
}
