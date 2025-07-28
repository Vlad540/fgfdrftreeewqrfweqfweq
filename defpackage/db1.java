package defpackage;

import android.widget.LinearLayout;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.profile.ProfileScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.arch.Widget;

/* renamed from: db1  reason: default package */
public final /* synthetic */ class db1 implements em {
    public final /* synthetic */ int a;
    public final /* synthetic */ p85 b;
    public final /* synthetic */ Widget c;

    public /* synthetic */ db1(p85 p85, Widget widget, int i) {
        this.a = i;
        this.b = p85;
        this.c = widget;
    }

    public final void U(fm fmVar, int i) {
        boolean z = false;
        ProfileScreen profileScreen = this.c;
        p85 p85 = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = CallLinkInfoScreen.F0;
                float interpolation = p85.getInterpolation(((float) Math.abs(i)) / ((float) fmVar.getTotalScrollRange()));
                k77[] k77Arr2 = CallLinkInfoScreen.F0;
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) profileScreen;
                ((LinearLayout) callLinkInfoScreen.Z.T0(callLinkInfoScreen, k77Arr2[0])).setAlpha(1.0f - interpolation);
                ((nea) callLinkInfoScreen.x0.T0(callLinkInfoScreen, k77Arr2[2])).setTitleAlpha(interpolation);
                return;
            case 1:
                k77[] k77Arr3 = CallOpponentsListWidget.L0;
                float interpolation2 = p85.getInterpolation(((float) Math.abs(i)) / ((float) fmVar.getTotalScrollRange()));
                float f = 1.0f - interpolation2;
                CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) profileScreen;
                callOpponentsListWidget.m0().setAlpha(f);
                LinearLayout m0 = callOpponentsListWidget.m0();
                if (f > 0.1f) {
                    z = true;
                }
                kjd.U(m0, z);
                callOpponentsListWidget.o0().setTitleAlpha(interpolation2);
                return;
            case 2:
                k77[] k77Arr4 = ProfileEditScreen.C0;
                float interpolation3 = p85.getInterpolation(((float) Math.abs(i)) / ((float) fmVar.getTotalScrollRange()));
                ProfileEditScreen profileEditScreen = (ProfileEditScreen) profileScreen;
                ((LinearLayout) profileEditScreen.x0.T0(profileEditScreen, ProfileEditScreen.C0[3])).setAlpha(1.0f - interpolation3);
                profileEditScreen.l0().setTitleAlpha(interpolation3);
                return;
            default:
                k77[] k77Arr5 = ProfileScreen.H0;
                float interpolation4 = p85.getInterpolation(((float) Math.abs(i)) / ((float) fmVar.getTotalScrollRange()));
                ProfileScreen profileScreen2 = profileScreen;
                ((LinearLayout) profileScreen2.w0.T0(profileScreen2, ProfileScreen.H0[3])).setAlpha(1.0f - interpolation4);
                profileScreen2.o0().setTitleAlpha(interpolation4);
                return;
        }
    }
}
