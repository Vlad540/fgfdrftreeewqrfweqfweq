package defpackage;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory;

/* renamed from: f93  reason: default package */
public final class f93 implements n3b {
    public final k4f a;

    public f93(e93 e93) {
        this.a = e93;
    }

    public final m3b a(Context context, z23 z23, z4f z4f, c93 c93, e8c e8c) {
        try {
            return PreviewingSingleInputVideoGraph$Factory.class.getConstructor(new Class[]{k4f.class}).newInstance(new Object[]{this.a}).a(context, z23, z4f, c93, e8c);
        } catch (Exception e) {
            throw VideoFrameProcessingException.a(e);
        }
    }
}
