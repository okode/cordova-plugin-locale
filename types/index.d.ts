interface Navigator {
    locale: {
        getCountryCode(success: (countryCode: string) => void, error?: (reason: string) => void): void;
    }
}