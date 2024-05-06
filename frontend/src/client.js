import { useQuery } from 'react-query';

const checkStatus = response => {
    // Handles successful response
    if (response.ok) {
        return response;
    }

    // Handles error response
    const error = new Error(response.statusText);
    error.response = response;
    return Promise.reject(error);
}

export const getAllListings = () =>
    fetch("http://localhost:8080/api/v1/listing")
        .then(checkStatus);

export function ListComponent() {
    const {isLoading, isError, error, data} =
        useQuery('getAllListings', getAllListings);

    if (isLoading) return 'Loading...';

    if (isError) return `An error has occurred: ${error.message}`;

    return `Successful API call: ${data}`;
}