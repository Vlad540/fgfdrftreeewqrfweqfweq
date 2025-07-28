package defpackage;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.os.Bundle;

/* renamed from: n70  reason: default package */
public final class n70 extends AbstractAccountAuthenticator {
    public final Context a;
    public final a5 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;

    public n70(Context context, a5 a5Var, t97 t97, t97 t972, t97 t973) {
        super(context);
        this.a = context;
        this.b = a5Var;
        this.c = t97;
        this.d = t972;
        this.e = t973;
    }

    public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (((c5) this.c.getValue()).a() != null) {
            this.b.getClass();
            bundle2.putInt("errorCode", 1029);
            bundle2.putString("errorMessage", this.a.getString(eub.account_already_exists));
        }
        return bundle2;
    }

    public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        return null;
    }

    public final Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        return null;
    }

    public final Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) {
        udd.q("n70", "getAccountRemovalAllowed");
        Bundle accountRemovalAllowed = super.getAccountRemovalAllowed(accountAuthenticatorResponse, account);
        t97 t97 = this.d;
        if (((zy9) t97.getValue()).d() && accountRemovalAllowed != null && accountRemovalAllowed.containsKey("booleanResult") && !accountRemovalAllowed.containsKey("intent") && accountRemovalAllowed.getBoolean("booleanResult")) {
            boolean e2 = ((zy9) t97.getValue()).e();
            int i = s0d.o;
            int i2 = zp4.o;
            s0d.c = mt0.Q(System.nanoTime(), eq4.b);
            ((luf) this.e.getValue()).a(new s0d(e2));
        }
        return accountRemovalAllowed;
    }

    public final Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        ((c5) this.c.getValue()).getClass();
        return new Bundle();
    }

    public final String getAuthTokenLabel(String str) {
        return null;
    }

    public final Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        return null;
    }

    public final Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        return null;
    }
}
