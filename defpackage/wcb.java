package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;

/* renamed from: wcb  reason: default package */
public final /* synthetic */ class wcb implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileMemberPermissionsScreen b;

    public /* synthetic */ wcb(ProfileMemberPermissionsScreen profileMemberPermissionsScreen, int i) {
        this.a = i;
        this.b = profileMemberPermissionsScreen;
    }

    public final Object invoke(Object obj) {
        jue jue = jue.a;
        ProfileMemberPermissionsScreen profileMemberPermissionsScreen = this.b;
        switch (this.a) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) obj;
                int i = ProfileMemberPermissionsScreen.o;
                nea nea = new nea(linearLayout.getContext(), 6);
                nea.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                nea.setTitle(i8a.H1);
                nea.setForm(fea.a);
                nea.setTextShimmerEnabled(false);
                nea.setLeftActions(new vda(new wcb(profileMemberPermissionsScreen, 1)));
                linearLayout.addView(nea);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
                recyclerView.setLayoutParams(new re3(-1, -1));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), a24.X(((float) 16) * dh4.c().getDisplayMetrics().density), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
                recyclerView.setAdapter(profileMemberPermissionsScreen.c);
                recyclerView.setItemAnimator((k6c) null);
                ub9 ub9 = gz6.a;
                ub9 ub92 = new ub9(1);
                ub92.g(2048);
                recyclerView.j(new qtc(km4.y0.r(recyclerView), new w48(profileMemberPermissionsScreen, 21, ub92), (o8) null, 12));
                float f = (float) 6;
                int X = a24.X(dh4.c().getDisplayMetrics().density * f);
                int i2 = zy6.a;
                rb9 rb9 = new rb9();
                rb9.e(1024, 0);
                rb9.e(2048, X);
                int X2 = a24.X(f * dh4.c().getDisplayMetrics().density);
                rb9 rb92 = new rb9();
                rb92.e(1024, 0);
                rb92.e(2048, X2);
                int X3 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                int X4 = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
                rb9 rb93 = new rb9();
                rb93.e(1024, X3);
                rb93.e(2048, X4);
                recyclerView.j(new ku7(rb93, rb9, rb92, 0));
                linearLayout.addView(recyclerView);
                return jue;
            default:
                View view = (View) obj;
                int i3 = ProfileMemberPermissionsScreen.o;
                jdb l0 = profileMemberPermissionsScreen.l0();
                l0.getClass();
                taf.o(l0.B0, v03.b);
                return jue;
        }
    }
}
