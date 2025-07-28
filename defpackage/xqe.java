package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* renamed from: xqe  reason: default package */
public abstract class xqe {
    public static long a(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void b(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }
}
