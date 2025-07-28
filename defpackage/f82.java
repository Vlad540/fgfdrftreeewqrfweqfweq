package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: f82  reason: default package */
public final class f82 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ b92 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f82(b92 b92, Continuation continuation) {
        super(2, continuation);
        this.Y = b92;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new f82(this.Y, continuation);
    }

    /* JADX INFO: finally extract failed */
    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            b92 b92 = this.Y;
            String str = b92.O0;
            udc e = b92.e();
            this.X = 1;
            e.getClass();
            obj = r1g.g(e.a, new CancellationSignal(), new sdc(e, pec.a(0, "SELECT * FROM chat_folder WHERE isHiddenForAllFolder = 1"), 2), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bs bsVar = new bs(0);
        EnumSet<E> noneOf = EnumSet.noneOf(r72.class);
        b92 b922 = this.Y;
        for (hdc hdc : (List) obj) {
            String str2 = b92.O0;
            udc e2 = b922.e();
            String str3 = hdc.a;
            e2.getClass();
            pec a = pec.a(1, "SELECT chatId FROM folder_and_chats WHERE folderId = ?");
            if (str3 == null) {
                a.W(1);
            } else {
                a.f(1, str3);
            }
            aec aec = e2.a;
            aec.b();
            Cursor o = aec.o(a, (CancellationSignal) null);
            try {
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    arrayList.add(o.isNull(0) ? null : Long.valueOf(o.getLong(0)));
                }
                o.close();
                a.m();
                bsVar.addAll(arrayList);
                noneOf.addAll(hdc.e);
            } catch (Throwable th) {
                o.close();
                a.m();
                throw th;
            }
        }
        ep5 a2 = ((hdc) this.Y.F0.getValue()).a(hw4.a, bsVar, noneOf, (v6a) this.Y.o.getValue());
        this.Y.H0 = a2;
        this.Y.x0.put("all.chat.folder", a2);
        return a2;
    }
}
