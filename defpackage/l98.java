package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: l98  reason: default package */
public final class l98 extends l5e implements i26 {
    public File X;
    public String Y;
    public int Z;
    public final /* synthetic */ n98 w0;
    public final /* synthetic */ yk7 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l98(n98 n98, yk7 yk7, Continuation continuation) {
        super(2, continuation);
        this.w0 = n98;
        this.x0 = yk7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l98(this.w0, this.x0, continuation);
    }

    public final Object o(Object obj) {
        File file;
        String str;
        File file2;
        String str2;
        pu3 pu3 = pu3.a;
        int i = this.Z;
        n98 n98 = this.w0;
        if (i == 0) {
            wx3.H(obj);
            file = ((mg5) ((bf5) n98.Y.getValue())).q(String.valueOf(System.currentTimeMillis()));
            Uri x = at7.x(this.x0.b.toString());
            str = file.getAbsolutePath();
            if (x != null) {
                this.X = file;
                this.Y = str;
                this.Z = 1;
                if (n98.q(n98, file, x, this) == pu3) {
                    return pu3;
                }
                file2 = file;
                str2 = str;
            }
            taf.o(n98.z0, new d98(Uri.fromFile(file), str));
            return jue.a;
        } else if (i == 1) {
            str2 = this.Y;
            file2 = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        at7.I((xzc) n98.Z.getValue(), str2, str2);
        at7.H((xzc) n98.Z.getValue(), str2);
        file = file2;
        str = str2;
        taf.o(n98.z0, new d98(Uri.fromFile(file), str));
        return jue.a;
    }
}
