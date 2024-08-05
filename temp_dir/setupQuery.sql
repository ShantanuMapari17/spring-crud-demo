CREATE TABLE datastore_type (
    type VARCHAR(255) PRIMARY KEY,
    description VARCHAR(255),
    isActive BOOLEAN
);

CREATE TABLE datastore_fields (
    datastore_type VARCHAR(255),
    section VARCHAR(255),
    input_fields JSON,
    PRIMARY KEY (datastore_type, section),
    FOREIGN KEY (datastore_type) REFERENCES datastore_type(type)
);

INSERT INTO datastore_type (type, description, isActive) VALUES ("BigQuery", "Big query desc", true);

INSERT INTO datastore_fields (datastore_type, section, input_fields)
VALUES (
    'BigQuery',
    'basic_settings',
    '[
        {
            "displayName": "Data Store Name",
            "propertyName": "name",
            "propertyType": "text",
            "isMandatory": true
        },
        {
            "displayName": "Data Store Description",
            "propertyName": "description",
            "propertyType": "text",
            "isMandatory": false
        },
        {
            "displayName": "Data Store Host",
            "propertyName": "datastoreHost",
            "propertyType": "text",
            "isMandatory": true
        },
        {
            "displayName": "Data Store Port",
            "propertyName": "datstorePort",
            "propertyType": "number",
            "isMandatory": true
        },
        {
            "displayName": "Project Id",
            "propertyName": "projectId",
            "propertyType": "text",
            "isMandatory": true
        },
        {
            "displayName": "Billing Project Id",
            "propertyName": "billingProjectId",
            "propertyType": "text",
            "isMandatory": false
        },
        {
            "displayName": "Total Scope",
            "propertyName": "totalScope",
            "propertyType": "number",
            "isMandatory": true
        }
    ]'
);


INSERT INTO datastore_fields (datastore_type, section, input_fields)
VALUES (
    'BigQuery',
    'connection_settings',
    '{
        "subSections": [
            {
                "id": "Service Account Settings",
                "fields": [
                    {
                        "displayName": "Please use one option:\\n 1. Upload service account file\\n 2. Full path of service account",
                        "propertyName": "fileUpload",
                        "propertyType": "button",
                        "isMandatory": false
                    },
                    {
                        "displayName": "Service Account full path",
                        "propertyName": "OAuthPvtKeyPath",
                        "propertyType": "text",
                        "isMandatory": false
                    },
                    {
                        "displayName": "Service Account Email",
                        "propertyName": "OAuthServiceAcctEmail",
                        "propertyType": "text",
                        "isMandatory": false
                    }
                ]
            },
            {
                "id": "Vault Settings",
                "fields": [
                    {
                        "displayName": "Vault Host",
                        "propertyName": "VaultHost",
                        "propertyType": "text",
                        "isMandatory": true
                    },
                    {
                        "displayName": "Vault Port",
                        "propertyName": "VaultPort",
                        "propertyType": "text",
                        "isMandatory": false
                    },
                    {
                        "displayName": "Vault Role Id",
                        "propertyName": "VaultRoleId",
                        "propertyType": "text",
                        "isMandatory": false
                    },
                    {
                        "displayName": "Vault Role Secret",
                        "propertyName": "VaultRoleSecret",
                        "propertyType": "text",
                        "isMandatory": false
                    },
                    {
                        "displayName": "Vault Impersonated Account Name",
                        "propertyName": "VaultImpersonatedAccountName",
                        "propertyType": "text",
                        "isMandatory": false
                    },
                    {
                        "displayName": "Vault Namespace",
                        "propertyName": "VaultNamespace",
                        "propertyType": "text",
                        "isMandatory": false
                    },
                    {
                        "displayName": "Vault Secret Engine Path",
                        "propertyName": "VaultSecretEnginePath",
                        "propertyType": "text",
                        "isMandatory": false
                    },
                    {
                        "displayName": "Proxy Enabled for Vault",
                        "propertyName": "VaultProxyEnabled",
                        "propertyType": "checkbox",
                        "isMandatory": false
                    },
                    {
                        "displayName": "SSL Enabled for Vault",
                        "propertyName": "VaultSslEnabled",
                        "propertyType": "checkbox",
                        "isMandatory": false
                    }
                ]
            }
        ]
    }'
);


INSERT INTO datastore_fields (datastore_type, section, input_fields)
VALUES (
    'BigQuery',
    'proxy_settings',
    '[
        {
            "displayName": "Proxy Host",
            "propertyName": "ProxyHost",
            "propertyType": "text",
            "isMandatory": false
        },
        {
            "displayName": "Proxy Port",
            "propertyName": "ProxyPort",
            "propertyType": "text",
            "isMandatory": false
        },
        {
            "displayName": "Proxy Username",
            "propertyName": "ProxyUid",
            "propertyType": "text",
            "isMandatory": false
        },
        {
            "displayName": "Proxy Password",
            "propertyName": "ProxyPwd",
            "propertyType": "password",
            "isMandatory": false
        },
        {
            "displayName": "SSL Truststore",
            "propertyName": "SSLTrustStore",
            "propertyType": "text",
            "isMandatory": false
        },
        {
            "displayName": "SSL Truststore Password",
            "propertyName": "SSLTrustStorePwd",
            "propertyType": "password",
            "isMandatory": false
        }
    ]'
);


INSERT INTO datastore_fields (datastore_type, section, input_fields)
VALUES (
    'BigQuery',
    'pelican_settings',
    '[
        {
            "displayName": "Temporary Database",
            "propertyName": "temporaryDatabase",
            "propertyType": "text",
            "isMandatory": true
        }
    ]'
);

