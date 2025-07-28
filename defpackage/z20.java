package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: z20  reason: default package */
public final class z20 extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ a30 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z20(a30 a30, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = a30;
        this.a = contentResolver;
        this.b = uri;
    }

    public final void onChange(boolean z) {
        a30 a30 = this.c;
        a30.g(w20.b((Context) a30.b, (k20) a30.y0, (i30) a30.x0));
    }
}
