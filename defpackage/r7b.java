package defpackage;

import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: r7b  reason: default package */
public final /* synthetic */ class r7b implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget b;

    public /* synthetic */ r7b(ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget, int i) {
        this.a = i;
        this.b = profileEditAdminPermissionsWidget;
    }

    public final Object invoke() {
        int i = 0;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ProfileEditAdminPermissionsWidget.B0;
                k77 k77 = k77Arr[0];
                long longValue = ((Number) profileEditAdminPermissionsWidget.b.a(profileEditAdminPermissionsWidget)).longValue();
                k77 k772 = k77Arr[1];
                long longValue2 = ((Number) profileEditAdminPermissionsWidget.c.a(profileEditAdminPermissionsWidget)).longValue();
                b7b m0 = profileEditAdminPermissionsWidget.m0();
                boolean l0 = profileEditAdminPermissionsWidget.l0();
                z7b z7b = z7b.a;
                return new q7b(longValue, longValue2, m0, l0, (bv2) z7b.c().getValue(), (ap3) z7b.getAccessor().d(ap3.class).getValue(), z7b.getAccessor().d(i5b.class), z7b.b(), z7b.d(), z7b.getAccessor().d(jb5.class), z7b.getAccessor().d(ia.class));
            default:
                k77[] k77Arr2 = ProfileEditAdminPermissionsWidget.B0;
                OneMeButton oneMeButton = new OneMeButton(profileEditAdminPermissionsWidget.getContext(), (AttributeSet) null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                int X = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                layoutParams.leftMargin = X;
                layoutParams.rightMargin = X;
                layoutParams.topMargin = X;
                layoutParams.bottomMargin = X;
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setSize(v0a.c);
                oneMeButton.setMode(u0a.a);
                oneMeButton.setAppearance(s0a.c);
                if (profileEditAdminPermissionsWidget.m0() != b7b.SETUP_NEW_ADMIN) {
                    i = 8;
                }
                oneMeButton.setVisibility(i);
                oneMeButton.setText(profileEditAdminPermissionsWidget.m0() == b7b.CHANGE_ADMIN ? i8a.j1 : i8a.L0);
                a24.a0(oneMeButton, new eu5(28, profileEditAdminPermissionsWidget));
                return oneMeButton;
        }
    }
}
