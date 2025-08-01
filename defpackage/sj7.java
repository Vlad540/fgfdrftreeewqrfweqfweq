package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: sj7  reason: default package */
public final class sj7 extends jk7 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sj7(Executor executor, qe4 qe4, Object obj, int i) {
        super(executor, qe4);
        this.c = i;
        this.d = obj;
    }

    public final ax4 d(tr6 tr6) {
        int i;
        int i2;
        switch (this.c) {
            case 0:
                String substring = tr6.b.getPath().substring(1);
                AssetManager assetManager = (AssetManager) this.d;
                InputStream open = assetManager.open(substring, 2);
                AssetFileDescriptor assetFileDescriptor = null;
                try {
                    AssetFileDescriptor openFd = assetManager.openFd(tr6.b.getPath().substring(1));
                    i = (int) openFd.getLength();
                    try {
                        openFd.close();
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    if (assetFileDescriptor != null) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException unused3) {
                        }
                    }
                    i = -1;
                } catch (Throwable th) {
                    if (assetFileDescriptor != null) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
                return c(open, i);
            default:
                String path = tr6.b.getPath();
                if (path != null) {
                    int parseInt = Integer.parseInt(path.substring(1));
                    Resources resources = (Resources) this.d;
                    InputStream openRawResource = resources.openRawResource(parseInt);
                    AssetFileDescriptor assetFileDescriptor2 = null;
                    try {
                        String path2 = tr6.b.getPath();
                        if (path2 != null) {
                            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(Integer.parseInt(path2.substring(1)));
                            i2 = (int) openRawResourceFd.getLength();
                            try {
                                openRawResourceFd.close();
                            } catch (IOException unused5) {
                            }
                            return c(openRawResource, i2);
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    } catch (Resources.NotFoundException unused6) {
                        if (assetFileDescriptor2 != null) {
                            try {
                                assetFileDescriptor2.close();
                            } catch (IOException unused7) {
                            }
                        }
                        i2 = -1;
                    } catch (Throwable th2) {
                        if (assetFileDescriptor2 != null) {
                            try {
                                assetFileDescriptor2.close();
                            } catch (IOException unused8) {
                            }
                        }
                        throw th2;
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
        }
    }

    public final String e() {
        switch (this.c) {
            case 0:
                return "LocalAssetFetchProducer";
            default:
                return "LocalResourceFetchProducer";
        }
    }
}
