package defpackage;

import android.view.ViewGroup;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: wi9  reason: default package */
public final /* synthetic */ class wi9 implements em {
    public final /* synthetic */ NeuroAvatarsScreen a;

    public /* synthetic */ wi9(NeuroAvatarsScreen neuroAvatarsScreen) {
        this.a = neuroAvatarsScreen;
    }

    public final void U(fm fmVar, int i) {
        k77[] k77Arr = NeuroAvatarsScreen.Q0;
        NeuroAvatarsScreen neuroAvatarsScreen = this.a;
        float interpolation = neuroAvatarsScreen.C0.getInterpolation(((float) Math.abs(i)) / ((float) neuroAvatarsScreen.l0().getTotalScrollRange()));
        k77[] k77Arr2 = NeuroAvatarsScreen.Q0;
        ((ViewGroup) neuroAvatarsScreen.Z.T0(neuroAvatarsScreen, k77Arr2[2])).setAlpha(1.0f - interpolation);
        ((nea) neuroAvatarsScreen.x0.T0(neuroAvatarsScreen, k77Arr2[4])).setTitleAlpha(interpolation);
    }
}
