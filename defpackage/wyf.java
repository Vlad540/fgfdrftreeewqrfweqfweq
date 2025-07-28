package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.a;

/* renamed from: wyf  reason: default package */
public final class wyf extends n06 {
    public final /* synthetic */ int f;

    public /* synthetic */ wyf(int i) {
        this.f = i;
    }

    public ok h(Context context, Looper looper, h2d h2d, Object obj, oa6 oa6, pa6 pa6) {
        switch (this.f) {
            case 0:
                efd efd = (efd) obj;
                h2d.getClass();
                Integer num = (Integer) h2d.Z;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Account) h2d.a);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new dfd(context, looper, h2d, bundle, oa6, pa6);
            case 1:
                hr1.r(obj);
                throw null;
            case 3:
                return new a(context, looper, 126, h2d, oa6, pa6);
            case 5:
                return new q5g(context, looper, h2d, (u60) obj, oa6, pa6);
            case 6:
                return new u3g(context, looper, h2d, (GoogleSignInOptions) obj, oa6, pa6);
            default:
                return super.h(context, looper, h2d, obj, oa6, pa6);
        }
    }

    public ok i(Context context, Looper looper, h2d h2d, Object obj, oa6 oa6, pa6 pa6) {
        switch (this.f) {
            case 2:
                return new m0g(context, looper, h2d, (tee) obj, oa6, pa6);
            case 4:
                mk mkVar = (mk) obj;
                return new v2g(context, looper, h2d, oa6, pa6);
            case 7:
                mk mkVar2 = (mk) obj;
                return new a(context, looper, 300, h2d, oa6, pa6);
            default:
                return super.i(context, looper, h2d, obj, oa6, pa6);
        }
    }
}
