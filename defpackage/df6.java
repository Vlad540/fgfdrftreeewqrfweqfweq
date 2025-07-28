package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Debug;
import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: df6  reason: default package */
public final class df6 extends l5e implements i26 {
    public File X;
    public int Y;
    public final /* synthetic */ ef6 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public df6(ef6 ef6, Continuation continuation) {
        super(2, continuation);
        this.Z = ef6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((df6) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new df6(this.Z, continuation);
    }

    public final Object o(Object obj) {
        File file;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        ef6 ef6 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            File i2 = ((mg5) ef6.c.getValue()).i("oneme_heap_dump.hprof");
            Debug.dumpHprofData(i2.getAbsolutePath());
            zr7 immediate = ((pae) ef6.b.getValue()).c().getImmediate();
            cf6 cf6 = new cf6(ef6, i2, (Continuation) null);
            this.X = i2;
            this.Y = 1;
            if (xs7.U(immediate, cf6, this) == pu3) {
                return pu3;
            }
            file = i2;
        } else if (i == 1) {
            file = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Context context = (Context) ef6.a.getValue();
        Uri f = ((mg5) ef6.c.getValue()).f(context, file);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.STREAM", f);
        Intent createChooser = Intent.createChooser(intent, (CharSequence) null);
        createChooser.addFlags(268435456);
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(createChooser, 65536)) {
            context.grantUriPermission(resolveInfo.activityInfo.packageName, f, 3);
        }
        context.startActivity(createChooser);
        return jue.a;
    }
}
