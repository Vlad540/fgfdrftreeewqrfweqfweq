package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: lw2  reason: default package */
public final class lw2 {
    public final dm4 a;

    public lw2(dm4 dm4) {
        this.a = dm4;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [f97, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v8, types: [java.lang.Object, n00] */
    /* JADX WARNING: type inference failed for: r13v4, types: [w52, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v17, types: [w7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v36, types: [e62, java.lang.Object] */
    public final o62 a(byte[] bArr) {
        n62 n62;
        ArrayList arrayList;
        ArrayList arrayList2;
        Map<Long, Protos.Chat.AdminParticipant> map;
        int i = 2;
        byte[] bArr2 = b.a;
        try {
            Protos.Chat mergeFrom = gr8.mergeFrom(new Protos.Chat(), bArr);
            y52 y52 = new y52();
            y52.a = mergeFrom.serverId;
            int i2 = mergeFrom.type;
            if (i2 != 0) {
                n62 = n62.b;
                if (i2 != 1) {
                    if (i2 == 2) {
                        n62 = n62.c;
                    } else if (i2 == 3) {
                        n62 = n62.o;
                    }
                }
            } else {
                n62 = n62.a;
            }
            y52.b = n62;
            int i3 = mergeFrom.status;
            m62 m62 = m62.a;
            switch (i3) {
                case 1:
                    m62 = m62.b;
                    break;
                case 2:
                    m62 = m62.c;
                    break;
                case 3:
                    m62 = m62.o;
                    break;
                case 4:
                    m62 = m62.X;
                    break;
                case 5:
                    m62 = m62.Y;
                    break;
                case 6:
                    m62 = m62.Z;
                    break;
            }
            y52.c = m62;
            y52.d = mergeFrom.owner;
            y52.e = mergeFrom.participants;
            y52.f = mergeFrom.created;
            y52.g = mergeFrom.title;
            y52.h = mergeFrom.baseIconUrl;
            y52.i = mergeFrom.baseRawIconUrl;
            y52.j = mergeFrom.lastMessageId;
            y52.k = mergeFrom.lastEventTime;
            y52.P = mergeFrom.joinTime;
            y52.l = mergeFrom.cid;
            y52.m = mergeFrom.newMessages;
            y52.l0 = mergeFrom.markedAsUnread;
            Protos.Chat.Chunk[] chunkArr = mergeFrom.chunk;
            if (chunkArr != null && chunkArr.length > 0) {
                for (Protos.Chat.Chunk i4 : chunkArr) {
                    y52.n.a(b.i(i4), md4.REGULAR);
                }
            }
            Protos.Chat.Chunk[] chunkArr2 = mergeFrom.delayedChunk;
            if (chunkArr2 != null && chunkArr2.length > 0) {
                for (Protos.Chat.Chunk i5 : chunkArr2) {
                    y52.n.a(b.i(i5), md4.DELAYED);
                }
            }
            y52.o = mergeFrom.lastInput;
            Protos.Chat.ChatSettings chatSettings = mergeFrom.chatSettings;
            if (chatSettings != null) {
                ? obj = new Object();
                obj.c = chatSettings.lastNotifMark;
                obj.d = chatSettings.lastNotifMessageId;
                obj.a = chatSettings.dontDisturbUntil;
                int[] iArr = chatSettings.options;
                if (iArr != null && iArr.length > 0) {
                    for (int i6 : iArr) {
                        if (i6 == 0) {
                            obj.a(c62.a);
                        } else if (i6 == 1) {
                            obj.a(c62.b);
                        } else if (i6 == 2) {
                            obj.a(c62.c);
                        }
                    }
                }
                obj.e = chatSettings.favoriteIndex;
                obj.f = chatSettings.hideMyLiveLocationPanelBeforeTime;
                obj.g = chatSettings.hideLiveLocationPanelBeforeTime;
                y52.p = new f62(obj);
            }
            Protos.Chat.ChatMedia chatMedia = mergeFrom.mediaAll;
            if (chatMedia != null) {
                y52.q = b.g(chatMedia);
            }
            Protos.Chat.ChatMedia chatMedia2 = mergeFrom.mediaPhotoVideo;
            if (chatMedia2 != null) {
                y52.r = b.g(chatMedia2);
            }
            Protos.Chat.ChatMedia chatMedia3 = mergeFrom.mediaMusic;
            if (chatMedia3 != null) {
                y52.t = b.g(chatMedia3);
            }
            Protos.Chat.ChatMedia chatMedia4 = mergeFrom.mediaAudio;
            if (chatMedia4 != null) {
                y52.u = b.g(chatMedia4);
            }
            Protos.Chat.ChatMedia chatMedia5 = mergeFrom.mediaFiles;
            if (chatMedia5 != null) {
                y52.v = b.g(chatMedia5);
            }
            Protos.Chat.ChatMedia chatMedia6 = mergeFrom.mediaLocations;
            if (chatMedia6 != null) {
                y52.w = b.g(chatMedia6);
            }
            Protos.Chat.ChatMedia chatMedia7 = mergeFrom.mediaShare;
            if (chatMedia7 != null) {
                y52.s = b.g(chatMedia7);
            }
            y52.x = mergeFrom.firstMessageId;
            Protos.Chat.Section[] sectionArr = mergeFrom.sections;
            if (sectionArr != null && sectionArr.length > 0) {
                for (Protos.Chat.Section section : sectionArr) {
                    ? obj2 = new Object();
                    obj2.c = section.id;
                    obj2.d = section.title;
                    long[] jArr = section.stickers;
                    if (jArr != null) {
                        obj2.e = ek8.m(jArr);
                    }
                    obj2.a = section.marker;
                    obj2.b = section.collapsed;
                    l62 l62 = new l62(obj2);
                    if (y52.y == null) {
                        y52.y = new ArrayList();
                    }
                    y52.y.add(l62);
                }
            }
            String[] strArr = mergeFrom.stickersOrder;
            if (strArr != null && strArr.length > 0) {
                y52.z = Arrays.asList(strArr);
            }
            y52.A = mergeFrom.stickersSyncTime;
            int[] iArr2 = mergeFrom.localChanges;
            if (iArr2 != null && iArr2.length > 0) {
                for (int i7 : iArr2) {
                    if (i7 == 0) {
                        y52.a(z52.a);
                    } else if (i7 == 1) {
                        y52.a(z52.b);
                    } else if (i7 == 2) {
                        y52.a(z52.c);
                    } else if (i7 == 3) {
                        y52.a(z52.o);
                    }
                }
            }
            Protos.Chat.ChatSubject chatSubject = mergeFrom.chatSubject;
            if (chatSubject != null) {
                long[] jArr2 = chatSubject.organizationIds;
                if (jArr2.length > 0) {
                    y52.D = new g62(jArr2);
                }
            }
            Protos.Chat.ChannelInfo channelInfo = mergeFrom.channelInfo;
            if (channelInfo != null) {
                mergeFrom.participantsCount = channelInfo.membersCount;
                mergeFrom.description = channelInfo.description;
                mergeFrom.admins = channelInfo.admins;
                if (channelInfo.signAdmin) {
                    Protos.Chat.ChatOptions chatOptions = new Protos.Chat.ChatOptions();
                    chatOptions.signAdmin = true;
                    mergeFrom.chatOptions = chatOptions;
                }
            }
            if (mergeFrom.participantsCount == 0 && y52.d().size() > 0) {
                mergeFrom.participantsCount = y52.d().size();
            }
            y52.G = mergeFrom.participantsCount;
            y52.H = mergeFrom.description;
            y52.I = ek8.m(mergeFrom.admins);
            long[] jArr3 = mergeFrom.admins;
            if (jArr3 == null || ((map = mergeFrom.adminParticipants) != null && jArr3.length <= map.size())) {
                y52.e(b.a(mergeFrom.adminParticipants));
            } else {
                HashMap hashMap = new HashMap();
                Map<Long, Protos.Chat.AdminParticipant> map2 = mergeFrom.adminParticipants;
                if (map2 != null) {
                    hashMap.putAll(b.a(map2));
                }
                for (long j : mergeFrom.admins) {
                    if (!hashMap.containsKey(Long.valueOf(j))) {
                        Long valueOf = Long.valueOf(j);
                        ? obj3 = new Object();
                        obj3.b = j;
                        obj3.a = 2043;
                        hashMap.put(valueOf, new x52(obj3));
                    }
                }
                y52.e(hashMap);
            }
            y52.J = mergeFrom.blockedParticipantsCount;
            Protos.Chat.ChatOptions chatOptions2 = mergeFrom.chatOptions;
            if (chatOptions2 != null) {
                if (y52.K == null) {
                    y52.K = d62.j;
                }
                boolean z = y52.K.a;
                d62 d62 = r8;
                d62 d622 = new d62(chatOptions2.signAdmin, chatOptions2.onlyOwnerCanChangeIconTitle, chatOptions2.official, chatOptions2.onlyAdminCanAddMember, chatOptions2.allCanPinMessage, chatOptions2.onlyAdminCanCall, chatOptions2.sentByPhone, chatOptions2.serviceChat, chatOptions2.membersCanSeePrivateLink);
                y52.K = d62;
            }
            int i8 = mergeFrom.accessType;
            if (i8 == 0) {
                y52.r0 = 1;
            } else if (i8 == 1) {
                y52.r0 = 2;
            }
            y52.E = mergeFrom.link;
            y52.F = new ii5(mergeFrom.restrictions, 2);
            Protos.Chat.GroupChatInfo groupChatInfo = mergeFrom.groupChatInfo;
            if (groupChatInfo != null) {
                ad6 ad6 = ad6.b;
                long j2 = groupChatInfo.groupId;
                boolean z2 = groupChatInfo.isAnswered;
                boolean z3 = groupChatInfo.isModerator;
                boolean z4 = groupChatInfo.isImportant;
                String str = groupChatInfo.name;
                String str2 = groupChatInfo.baseIconUrl;
                boolean z5 = groupChatInfo.isCustomTitle;
                boolean z6 = groupChatInfo.isMember;
                Protos.Chat.GroupChatInfo.GroupOptions groupOptions = groupChatInfo.groupOptions;
                if (groupOptions != null) {
                    ad6 = new ad6(groupOptions.groupPremium);
                }
                ad6 ad62 = ad6;
                int i9 = groupChatInfo.messagingPermissions;
                y52.C = new j62(j2, z2, z3, z4, str, str2, z5, z6, i9 != 1 ? i9 != 2 ? 1 : 3 : 2, ad62);
            }
            y52.L = mergeFrom.pinnedMessageId;
            y52.M = mergeFrom.hidePinnedMessage;
            y52.N = mergeFrom.unreadReply;
            y52.O = mergeFrom.unreadPin;
            y52.Q = mergeFrom.messagesTtlSec;
            y52.S = mergeFrom.flagsSettings;
            Protos.Chat.VideoConversation videoConversation = mergeFrom.videoConversation;
            if (videoConversation != null) {
                long[] jArr4 = videoConversation.previewParticipantIds;
                if (jArr4 != null) {
                    arrayList2 = new ArrayList(jArr4.length);
                    for (long valueOf2 : jArr4) {
                        arrayList2.add(Long.valueOf(valueOf2));
                    }
                } else {
                    arrayList2 = null;
                }
                Protos.Chat.VideoConversation videoConversation2 = mergeFrom.videoConversation;
                int i10 = videoConversation2.type;
                if (i10 != 1) {
                    i = i10 != 2 ? 1 : 3;
                }
                ? obj4 = new Object();
                obj4.a = videoConversation2.conversationId;
                obj4.b = videoConversation2.startedAt;
                obj4.c = videoConversation2.joinLink;
                obj4.d = videoConversation2.approxParticipantCount;
                obj4.e = arrayList2;
                obj4.f = i;
                y52.T = new n00(obj4);
            }
            y52.U = mergeFrom.lastOpenPositionTime;
            y52.V = mergeFrom.lastOpenPositionOffset;
            y52.W = mergeFrom.lastOpenReadMark;
            y52.X = (int) mergeFrom.lastOpenNewMessages;
            y52.Y = mergeFrom.lastSearchClickTime;
            y52.Z = mergeFrom.lastWriteTime;
            Protos.Chat.LastInputMedia[] lastInputMediaArr = mergeFrom.lastInputMedia;
            if (lastInputMediaArr != null) {
                ArrayList arrayList3 = new ArrayList(lastInputMediaArr.length);
                for (Protos.Chat.LastInputMedia lastInputMedia : lastInputMediaArr) {
                    ? obj5 = new Object();
                    obj5.a = lastInputMedia.originalId;
                    obj5.b = lastInputMedia.originalUri;
                    obj5.c = lastInputMedia.thumbnailUri;
                    obj5.d = lastInputMedia.originalOrientation;
                    obj5.e = lastInputMedia.originalDuration;
                    obj5.f = lastInputMedia.mimeType;
                    obj5.g = lastInputMedia.dateModified;
                    obj5.h = lastInputMedia.editedUri;
                    obj5.k = lastInputMedia.attachLocalId;
                    obj5.i = lastInputMedia.type;
                    int[] iArr3 = lastInputMedia.wave;
                    if (iArr3 == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (int valueOf3 : iArr3) {
                            arrayList.add(Integer.valueOf(valueOf3));
                        }
                    }
                    obj5.j = arrayList;
                    arrayList3.add(new g97(obj5));
                }
                y52.a0 = arrayList3;
            }
            y52.b0 = mergeFrom.lastInputEditMessageId;
            y52.c0 = mergeFrom.lastInputReplyMessageId;
            y52.f0 = this.a.e(mergeFrom.draft);
            y52.g0 = mergeFrom.draftUpdateTime;
            y52.h0 = mergeFrom.draftUpdateTimeForSyncLogic;
            Protos.Chat.BotsInfo botsInfo = mergeFrom.botsInfo;
            y52.d0 = botsInfo == null ? kp0.c : new kp0(botsInfo.hasBots, botsInfo.suspendedBot);
            y52.e0 = mergeFrom.modified;
            y52.j0 = mergeFrom.liveLocationMessageIds;
            y52.i0 = mergeFrom.subscribedToUpdates;
            y52.k0 = mergeFrom.lastMentionMessageId;
            y52.n0 = mergeFrom.lastReactedMessageId;
            String str3 = mergeFrom.lastReaction;
            if (r1g.p(str3)) {
                y52.o0 = null;
            } else {
                y52.o0 = str3;
            }
            Protos.Chat.PushMessage pushMessage = mergeFrom.lastPushMessage;
            if (pushMessage != null) {
                y52.m0 = new k62(pushMessage.time, pushMessage.text, pushMessage.id);
            }
            y52.q0 = mergeFrom.lastFireDelayedErrorTime;
            y52.p0 = mergeFrom.lastDelayedUpdateTime;
            return new o62(y52);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
