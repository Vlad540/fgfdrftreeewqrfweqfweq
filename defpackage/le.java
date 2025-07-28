package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.c;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import java.util.Objects;

/* renamed from: le  reason: default package */
public final class le extends b97 implements s16 {
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ IntentSender b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Intent o;
    public final /* synthetic */ Bundle w0;
    public final /* synthetic */ Object x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ le(Object obj, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle, int i5) {
        super(0);
        this.a = i5;
        this.x0 = obj;
        this.b = intentSender;
        this.c = i;
        this.o = intent;
        this.X = i2;
        this.Y = i3;
        this.Z = i4;
        this.w0 = bundle;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = (AndroidXLifecycleHandlerImpl) this.x0;
                if (androidXLifecycleHandlerImpl.K0 != null) {
                    boolean isLoggable = Log.isLoggable("FragmentManager", 2);
                    IntentSender intentSender = this.b;
                    Intent intent = this.o;
                    Bundle bundle = this.w0;
                    if (isLoggable) {
                        androidXLifecycleHandlerImpl.toString();
                        Objects.toString(intentSender);
                        Objects.toString(intent);
                        Objects.toString(bundle);
                    }
                    c g0 = androidXLifecycleHandlerImpl.g0();
                    jg8 jg8 = g0.D;
                    int i = this.c;
                    int i2 = this.X;
                    int i3 = this.Y;
                    if (jg8 != null) {
                        if (bundle != null) {
                            if (intent == null) {
                                intent = new Intent();
                                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                            }
                            if (Log.isLoggable("FragmentManager", 2)) {
                                bundle.toString();
                                intent.toString();
                                Objects.toString(androidXLifecycleHandlerImpl);
                            }
                            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                        }
                        jz6 jz6 = new jz6(intentSender, intent, i2, i3);
                        g0.F.addLast(new qx5(androidXLifecycleHandlerImpl.Y, i));
                        if (Log.isLoggable("FragmentManager", 2)) {
                            androidXLifecycleHandlerImpl.toString();
                        }
                        g0.D.y(jz6);
                    } else {
                        hx5 hx5 = g0.w;
                        if (i == -1) {
                            Activity activity = hx5.A0;
                            if (activity != null) {
                                activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, this.Z, bundle);
                            } else {
                                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
                            }
                        } else {
                            hx5.getClass();
                            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
                        }
                    }
                    return jue.a;
                }
                throw new IllegalStateException("Fragment " + androidXLifecycleHandlerImpl + " not attached to Activity");
            default:
                ((qxa) this.x0).startIntentSenderForResult(this.b, this.c, this.o, this.X, this.Y, this.Z, this.w0);
                return jue.a;
        }
    }
}
