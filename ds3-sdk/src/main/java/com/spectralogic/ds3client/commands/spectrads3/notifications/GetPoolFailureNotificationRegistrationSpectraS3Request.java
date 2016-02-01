/*
 * ******************************************************************************
 *   Copyright 2014-2015 Spectra Logic Corporation. All Rights Reserved.
 *   Licensed under the Apache License, Version 2.0 (the "License"). You may not use
 *   this file except in compliance with the License. A copy of the License is located at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   or in the "license" file accompanying this file.
 *   This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *   CONDITIONS OF ANY KIND, either express or implied. See the License for the
 *   specific language governing permissions and limitations under the License.
 * ****************************************************************************
 */

// This code is auto-generated, do not modify
package com.spectralogic.ds3client.commands.spectrads3.notifications;

import com.spectralogic.ds3client.commands.notifications.AbstractGetNotificationRequest;
import java.util.UUID;

public class GetPoolFailureNotificationRegistrationSpectraS3Request extends AbstractGetNotificationRequest {

    // Variables
    
    // Constructor
    
    public GetPoolFailureNotificationRegistrationSpectraS3Request(final UUID notificationId) {
        super(notificationId);

        
    }


    @Override
    public String getPath() {
        return "/_rest_/pool_failure_notification_registration/" + this.getNotificationId().toString();
    }

    }