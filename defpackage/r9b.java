package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: r9b  reason: default package */
public final class r9b extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditScreen Y;
    public final /* synthetic */ View Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r9b(ProfileEditScreen profileEditScreen, View view, Continuation continuation) {
        super(2, continuation);
        this.Y = profileEditScreen;
        this.Z = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((x7b) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        r9b r9b = new r9b(this.Y, this.Z, continuation);
        r9b.X = obj;
        return r9b;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        x7b x7b = (x7b) this.X;
        k77[] k77Arr = ProfileEditScreen.C0;
        ProfileEditScreen profileEditScreen = this.Y;
        profileEditScreen.getClass();
        k77[] k77Arr2 = ProfileEditScreen.C0;
        k77 k77 = k77Arr2[4];
        n0c n0c = profileEditScreen.y0;
        ((mz9) n0c.T0(profileEditScreen, k77)).setAvatarUrl(x7b.a);
        mz9 mz9 = (mz9) n0c.T0(profileEditScreen, k77Arr2[4]);
        CharSequence charSequence = x7b.d;
        if (charSequence == null) {
            charSequence = "";
        }
        mz9.g(new ub0(charSequence, x7b.b), true);
        ((mz9) n0c.T0(profileEditScreen, k77Arr2[4])).setAddBadgeVisibility(x7b.f);
        int t = hr1.t(x7b.g);
        boolean z = x7b.e;
        if (t == 0) {
            nl0 nl0 = profileEditScreen.B0;
            if (!nl0.a()) {
                ((ViewGroup) this.Z).addView((View) nl0.getValue());
            }
            OneMeButton oneMeButton = (OneMeButton) nl0.getValue();
            int i = 0;
            oneMeButton.setVisibility(z ? 0 : 8);
            if (z) {
                i = (a24.X(((float) 12) * dh4.c().getDisplayMetrics().density) * 2) + oneMeButton.getMeasuredHeight();
            }
            RecyclerView recyclerView = (RecyclerView) profileEditScreen.Z.T0(profileEditScreen, k77Arr2[1]);
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i);
        } else if (t != 1) {
            throw new NoWhenBranchMatchedException();
        } else if (z) {
            profileEditScreen.l0().setRightActions(new xda(new l9b(profileEditScreen, 5)));
        } else {
            profileEditScreen.l0().setRightActions(yda.a);
        }
        return jue.a;
    }
}
