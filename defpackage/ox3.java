package defpackage;

import android.accounts.Account;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: ox3  reason: default package */
public final class ox3 {
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public void a() {
        if (!this.c) {
            this.c = true;
            TabLayout tabLayout = (TabLayout) this.d;
            ic6 ic6 = new ic6(tabLayout, 1);
            ViewPager2 viewPager2 = (ViewPager2) this.e;
            viewPager2.b(ic6);
            this.h = ic6;
            nx3 nx3 = new nx3(viewPager2, this.a, this.b);
            tabLayout.a(nx3);
            this.i = nx3;
            tabLayout.q(viewPager2.getCurrentItem(), 0.0f, true, true, true);
            s16 s16 = (s16) this.f;
            if (s16 != null) {
                s16.invoke();
            }
        }
    }

    public GoogleSignInOptions b() {
        Scope scope = GoogleSignInOptions.C0;
        HashSet hashSet = (HashSet) this.d;
        if (hashSet.contains(scope)) {
            Scope scope2 = GoogleSignInOptions.B0;
            if (hashSet.contains(scope2)) {
                hashSet.remove(scope2);
            }
        }
        if (this.c && (((Account) this.f) == null || !hashSet.isEmpty())) {
            ((HashSet) this.d).add(GoogleSignInOptions.A0);
        }
        return new GoogleSignInOptions(3, new ArrayList(hashSet), (Account) this.f, this.c, this.a, this.b, (String) this.e, (String) this.g, (HashMap) this.h, (String) this.i);
    }

    public void c() {
        if (this.c) {
            nx3 nx3 = (nx3) this.i;
            if (nx3 != null) {
                ((TabLayout) this.d).l(nx3);
            }
            this.i = null;
            ic6 ic6 = (ic6) this.h;
            if (ic6 != null) {
                ((ViewPager2) this.e).g(ic6);
            }
            this.h = null;
            this.c = false;
            s16 s16 = (s16) this.g;
            if (s16 != null) {
                s16.invoke();
            }
        }
    }
}
