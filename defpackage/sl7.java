package defpackage;

import android.content.ContentResolver;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* renamed from: sl7  reason: default package */
public final class sl7 implements y4b {
    public final /* synthetic */ int a;
    public final Executor b;
    public final ContentResolver c;

    public /* synthetic */ sl7(Executor executor, ContentResolver contentResolver, int i) {
        this.a = i;
        this.b = executor;
        this.c = contentResolver;
    }

    public final void a(ah0 ah0, z4b z4b) {
        switch (this.a) {
            case 0:
                ji0 ji0 = (ji0) z4b;
                c5b c5b = ji0.c;
                ji0.h("local", "thumbnail_bitmap");
                ah0 ah02 = ah0;
                c5b c5b2 = c5b;
                z4b z4b2 = z4b;
                z4b z4b3 = z4b;
                rl7 rl7 = new rl7(this, ah02, c5b2, z4b2, c5b, z4b3, ji0.a, new CancellationSignal());
                ji0.a(new fk7(rl7, 2));
                this.b.execute(rl7);
                return;
            default:
                ji0 ji02 = (ji0) z4b;
                c5b c5b3 = ji02.c;
                ji02.h("local", "video");
                ik7 ik7 = new ik7(this, ah0, c5b3, z4b, c5b3, z4b, ji02.a);
                ji02.a(new fk7(ik7, 3));
                this.b.execute(ik7);
                return;
        }
    }
}
