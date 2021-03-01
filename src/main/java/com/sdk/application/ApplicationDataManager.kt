package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface CatalogDataManager : CatalogApiHelperFace

interface LeadDataManager : LeadApiHelperFace

interface ThemeDataManager : ThemeApiHelperFace

interface UserDataManager : UserApiHelperFace

interface ContentDataManager : ContentApiHelperFace

interface CommunicationDataManager : CommunicationApiHelperFace

interface ShareDataManager : ShareApiHelperFace

interface FileStorageDataManager : FileStorageApiHelperFace

interface OrderDataManager : OrderApiHelperFace

interface FeedbackDataManager : FeedbackApiHelperFace

interface PosCartDataManager : PosCartApiHelperFace

