function solve(arr, type) {
    return type === 'asc'
        ? arr.sort((a, b) => a - b)
        : arr.sort((a, b) => b - a)
}