package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import kotlin.coroutines.Continuation;

/* renamed from: l82  reason: default package */
public final class l82 extends l5e implements i26 {
    public final /* synthetic */ b92 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l82(b92 b92, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.X = b92;
        this.Y = str;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l82(this.X, this.Y, this.Z, continuation);
    }

    /* JADX INFO: finally extract failed */
    public final Object o(Object obj) {
        wx3.H(obj);
        String str = b92.O0;
        udc e = this.X.e();
        e.getClass();
        pec a = pec.a(2, "SELECT COUNT(*) FROM folder_and_chats WHERE folderId = ? AND chatId = ?");
        boolean z = true;
        String str2 = this.Y;
        if (str2 == null) {
            a.W(1);
        } else {
            a.f(1, str2);
        }
        a.j(2, this.Z);
        aec aec = e.a;
        aec.b();
        Cursor o = aec.o(a, (CancellationSignal) null);
        try {
            long j = o.moveToFirst() ? o.getLong(0) : 0;
            o.close();
            a.m();
            if (j == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            o.close();
            a.m();
            throw th;
        }
    }
}
