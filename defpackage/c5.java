package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

/* renamed from: c5  reason: default package */
public final class c5 {
    public static final /* synthetic */ int c = 0;
    public final a5 a;
    public final r7e b;

    public c5(Context context, a5 a5Var) {
        this.a = a5Var;
        this.b = new r7e(new b5(context, 0));
    }

    public final Account a() {
        Account account;
        try {
            account = (Account) cs.Z(0, ((AccountManager) this.b.getValue()).getAccountsByType(this.a.a));
        } catch (Throwable th) {
            account = new kcc(th);
        }
        if (account instanceof kcc) {
            account = null;
        }
        return account;
    }

    public final void b() {
        udd.q("c5", "removeAccount start");
        Account a2 = a();
        if (a2 != null) {
            try {
                ((AccountManager) this.b.getValue()).removeAccountExplicitly(a2);
            } catch (Throwable th) {
                udd.s("c5", "removeAccountExplicitly failed!", th);
            }
        }
        udd.q("c5", "removeAccount finished!");
    }
}
